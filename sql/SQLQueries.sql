-- 1.Написать запрос, считающий суммарное количество имеющихся на сайте новостей и обзоров.
SELECT SUM(two.num_news_reviews) AS 'sum'
FROM (
SELECT count(*) AS num_news_reviews 
FROM reviews

UNION
    
SELECT count(*) AS num_news_reviews 
FROM news
) two;

-- 2.Написать запрос, показывающий список категорий новостей и количество новостей в каждой категории.
SELECT nc_name, COUNT(n_id) 
FROM news_categories 
LEFT JOIN news ON n_category = nc_id 
GROUP BY nc_name; 

-- 3.Написать запрос, показывающий список категорий обзоров и количество обзоров в каждой категории.
SELECT rc_name, COUNT(r_id) 
FROM reviews_categories
LEFT JOIN reviews ON r_category = rc_id 
GROUP BY rc_name;

-- 4.Написать запрос, показывающий список категорий новостей, категорий обзоров и дату самой свежей публикации в каждой категории.
SELECT  rc_name, MAX(r_dt) 
FROM reviews_categories  
JOIN  reviews ON r_category = rc_id 
GROUP BY rc_name
 
UNION

SELECT nc_name, MAX(n_dt)
FROM news_categories 
JOIN news ON nc_id=n_category
GROUP BY nc_name;

-- 5.Написать запрос, показывающий список страниц сайта верхнего уровня (у таких страниц нет родительской страницы) и список баннеров для каждой такой страницы.
SELECT p.p_name, b.b_id, b.b_url
FROM pages p 
JOIN m2m_banners_pages m2m ON p.p_id = m2m.p_id
JOIN banners b ON m2m.b_id = b.b_id
WHERE p.p_parent IS NULL;

-- 6 Написать запрос, показывающий список страниц сайта, на которых есть баннеры.
SELECT DISTINCT p.p_name 
FROM pages p
JOIN m2m_banners_pages m2m ON m2m.p_id = p.p_id
WHERE m2m.b_id IS NOT NULL;

-- 7 Написать запрос, показывающий список страниц сайта, на которых нет баннеров.
SELECT DISTINCT p.p_name 
FROM pages p
LEFT JOIN m2m_banners_pages m2m ON m2m.p_id = p.p_id
WHERE m2m.b_id IS NULL;

-- 8 Написать запрос, показывающий список баннеров, размещённых хотя бы на одной странице сайта.
SELECT DISTINCT b.b_id, b.b_url
FROM banners b
JOIN m2m_banners_pages m2m ON m2m.b_id = b.b_id
JOIN pages p ON m2m.p_id = p.p_id
WHERE p.p_name IS NOT NULL;

-- 9 Написать запрос, показывающий список баннеров, не размещённых ни на одной странице сайта.
SELECT DISTINCT b.b_id, b.b_url
FROM banners b
LEFT JOIN m2m_banners_pages m2m ON m2m.b_id = b.b_id
LEFT JOIN pages p ON m2m.p_id = p.p_id
WHERE p.p_name IS NULL;

-- 10 Написать запрос, показывающий баннеры, для которых отношение кликов к показам >= 80% (при условии, что баннер был показан хотя бы один раз).
SELECT b_id, b_url, b_click/b_show*100 AS rate
FROM banners
WHERE b_click >= b_show*0.8 AND b_show <> 0;

-- 11 Написать запрос, показывающий список страниц сайта, на которых показаны баннеры с текстом (в поле `b_text` не NULL).
SELECT DISTINCT p.p_name
FROM pages p
JOIN m2m_banners_pages m2m ON m2m.p_id = p.p_id
JOIN banners b ON b.b_id = m2m.b_id
WHERE b.b_text IS NOT NULL;

-- 12 Написать запрос, показывающий список страниц сайта, на которых показаны баннеры с картинкой (в поле `b_pic` не NULL).
SELECT DISTINCT p.p_name
FROM pages p
JOIN m2m_banners_pages m2m ON m2m.p_id = p.p_id
JOIN banners b ON b.b_id = m2m.b_id
WHERE b.b_pic IS NOT NULL;

-- 13 Написать запрос, показывающий список публикаций (новостей и обзоров) за 2011-й год.
SELECT n_header AS 'header', n_dt AS 'date'
FROM news
WHERE n_dt  BETWEEN '2011-01-01' AND '2011-12-31'

UNION

SELECT r_header,r_dt
FROM reviews
WHERE r_dt  BETWEEN '2011-01-01' AND '2011-12-31';

-- 14 Написать запрос, показывающий список категорий публикаций (новостей и обзоров), в которых нет публикаций.
SELECT rc_name AS 'category'
FROM reviews_categories 
LEFT JOIN reviews ON rc_id = r_category
WHERE r_category IS NULL

UNION

SELECT nc_name
FROM news_categories 
LEFT JOIN news ON nc_id = n_category
WHERE n_category IS NULL;

-- 15 Написать запрос, показывающий список новостей из категории «Логистика» за 2012-й год.
SELECT n_header , n_dt 
FROM news
JOIN news_categories ON n_category = nc_id
WHERE n_dt  BETWEEN '2012-01-01' AND '2012-12-31'  
			AND nc_name = 'Логистика';
              
-- 16 Написать запрос, показывающий список годов, за которые есть новости, а также количество новостей за каждый из годов.
SELECT year(n_dt) AS 'year', count(*)
FROM news
GROUP BY year(n_dt);

-- 17 Написать запрос, показывающий URL и id таких баннеров, где для одного и того же URL есть несколько баннеров
SELECT  b.b_url, b.b_id
FROM banners  b
JOIN banners s ON b.b_url = s.b_url
WHERE b.b_id<s.b_id

UNION

(SELECT  s.b_url,s.b_id
FROM banners  b
JOIN banners s ON b.b_url = s.b_url
WHERE b.b_id<s.b_id)
ORDER BY b_id;

-- 18 Hаписать запрос, показывающий список непосредственных подстраниц страницы «Юридическим лицам» со списком баннеров этих подстраниц.
SELECT pp.p_name, b.b_id, b.b_url
FROM pages p
JOIN pages pp  ON p.p_id =pp. p_parent
JOIN m2m_banners_pages m2m ON pp.p_id = m2m.p_id
JOIN banners b ON m2m.b_id = b.b_id
WHERE p.p_name = 'Юридическим лицам';

-- 19 Написать запрос, показывающий список всех баннеров с картинками (поле `b_pic` не NULL), отсортированный по убыванию отношения кликов по баннеру к показам баннера.
SELECT b_id, b_url , b_click/b_show AS 'rate'
FROM banners
WHERE b_pic IS NOT NULL
ORDER BY rate DESC;

-- 20 Написать запрос, показывающий самую старую публикацию на сайте (не важно – новость это или обзор).
SELECT header, date
FROM (SELECT n_header AS header, n_dt AS date
		FROM news
        
        UNION 
        
        SELECT r_header, r_dt
        FROM reviews) AS h1
WHERE date = (SELECT LEAST(MIN(n_dt), MIN(r_dt)) FROM news, reviews);

-- 21 Написать запрос, показывающий список баннеров, URL которых встречается в таблице один раз.
SELECT b_url, b_id
FROM banners
WHERE b_url IN (SELECT b_url
                FROM banners
                GROUP BY b_url
                HAVING COUNT(*) = 1);
  
-- 22  Написать запрос, показывающий список страниц сайта в порядке убывания количества баннеров, расположенных на странице. Для случаев, когда на нескольких страницах расположено одинаковое количество баннеров, этот список страниц должен быть отсортирован по возрастанию имён страниц.
SELECT p.p_name , count(b.b_id) AS 'banners_count'
FROM pages p
JOIN m2m_banners_pages m2m ON m2m.p_id = p.p_id
JOIN banners b ON b.b_id = m2m.b_id
GROUP BY p.p_name
ORDER BY banners_count DESC, p.p_name ASC;

-- 23 Написать запрос, показывающий самую «свежую» новость и самый «свежий» обзор.
SELECT n_header AS header, n_dt AS date
FROM news
WHERE n_dt=(SELECT MAX(n_dt) FROM news)
UNION
SELECT r_header, r_dt
FROM reviews
WHERE r_dt=(SELECT MAX(r_dt) FROM reviews);

-- 24 Написать запрос, показывающий баннеры, в тексте которых встречается часть URL, на который ссылается баннер
SELECT b_id,b_url, b_text
      FROM banners
      WHERE b_text = substr(b_url,8);

-- 25 Написать запрос, показывающий страницу, на которой размещён баннер с самым высоким отношением кликов к показам.
SELECT p.p_name 
FROM pages p
JOIN m2m_banners_pages m2m ON m2m.p_id = p.p_id
JOIN banners b ON b.b_id = m2m.b_id
ORDER BY b.b_click/b.b_show  DESC
LIMIT 1;

-- 26 Написать запрос, считающий среднее отношение кликов к показам по всем баннерам, которые были показаны хотя бы один раз.
SELECT AVG(b_click/b_show)
FROM banners
WHERE b_show <> 0;

-- 27.Написать запрос, считающий среднее отношение кликов к показам по баннерам, у которых нет графической части (поле `b_pic` равно NULL).
SELECT AVG(b_click/b_show)
FROM banners
WHERE b_show <> 0 AND b_pic IS NULL;

-- 28 Написать запрос, показывающий количество баннеров, размещённых на страницах сайта верхнего уровня (у таких страниц нет родительских страниц).
SELECT COUNT(b.b_id) AS COUNT
FROM pages p
JOIN m2m_banners_pages m2m ON m2m.p_id = p.p_id
JOIN banners b ON b.b_id = m2m.b_id
WHERE p.p_parent IS NULL;

-- 29 Написать запрос, показывающий баннер(ы), который(ые) показаны на самом большом количестве страниц.
SELECT  b.b_id, b.b_url, count( m2m.b_id) AS `COUNT`
FROM m2m_banners_pages AS m2m
JOIN   banners AS b ON b.b_id = m2m.b_id
GROUP BY m2m.b_id
LIMIT 1;

-- 30 Написать запрос, показывающий страницу(ы), на которой(ых) показано больше всего баннеров.
SELECT p_name, count_outer 
FROM pages, (
SELECT p_id, COUNT(*) AS count_outer 
FROM m2m_banners_pages
GROUP BY p_id
    ) t1
WHERE pages.p_id = t1.p_id
AND count_outer = (
SELECT MAX(count_inner) 
FROM (
SELECT COUNT(*) AS count_inner 
FROM m2m_banners_pages
GROUP BY p_id
    ) t2
);






