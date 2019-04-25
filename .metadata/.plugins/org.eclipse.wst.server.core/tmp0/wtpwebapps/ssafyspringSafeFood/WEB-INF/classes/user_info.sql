CREATE TABLE IF NOT EXISTS  user_info (
  `user_id` VARCHAR(20) NOT NULL,
  `name` VARCHAR(20) NOT NULL,
  `password` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`user_id`));
  
  show tables;
  
  SELECT USER_ID, NAME, PASSWORD FROM user_info
  ORDER BY USER_ID;
  
  INSERT INTO user_info(USER_ID, NAME, PASSWORD)
  VALUES('ydg', '이동관', '1111');
  
  SELECT USER_ID, NAME, PASSWORD FROM user_info
  where USER_ID='ydg';
  
  update user_info set 
  NAME='양동구' , PASSWORD='2222'  where USER_ID='ydg';
  
  delete from user_info where USER_ID='ydg';
  
SELECT USER_ID, NAME, PASSWORD FROM user_info
  where NAME like '%동%';
  
  
  
  CREATE TABLE IF NOT EXISTS  book_info (
  `isbn` VARCHAR(45) NOT NULL,
  `author` VARCHAR(45) NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `publisher` VARCHAR(45) NOT NULL,
  `content` VARCHAR(45) NOT NULL,
  `price` int NOT NULL,
  `pubdate` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`isbn`));
  
  
 isbn
 author
 title
 publisher
 content
 price
 pubdate
  
  
  
  desc book_info;
  
  SELECT isbn,author,title,publisher,content,price,pubdate FROM book_info
  ORDER BY isbn
  
  INSERT INTO book_info(isbn,author,title,publisher,content,price,pubdate)
  VALUES('1111111','양동관','자바하기 싫어','싫어','시여 시여',11111,'2019-03-19');
    INSERT INTO book_info(isbn,author,title,publisher,content,price,pubdate)
  VALUES('1111112','이동경','자바하기 싫어2','싫어2','시여 시여2',11112,'2019-03-13');
  
  
  SELECT isbn,author,title,publisher,content,price,pubdate FROM book_info
  where isbn='isbn';
  
  update user_info set 
  NAME='양동구' , PASSWORD='2222'  where USER_ID='ydg';
  
  delete from user_info where USER_ID='ydg';
  
SELECT USER_ID, NAME, PASSWORD FROM user_info
  where NAME like '%동%';
  
 