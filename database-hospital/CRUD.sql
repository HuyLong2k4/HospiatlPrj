-- Post users
INSERT INTO Users(user_id, address, phone)
VALUES (1, 'Nga Sơn Thanh Hoa', '123-456-7890');
-- Get users
SELECT * FROM Users;
-- Get user
SELECT * FROM Users WHERE user_id = 1;
-- PUT user
UPDATE Users
SET address = 'Cau Giay Ha Noi', phone = '012-345-6789'
WHERE user_id = 1;
-- DELETE users
DELETE FROM Users;
-- Delete users
DELETE FROM Users WHERE user_id = 1;