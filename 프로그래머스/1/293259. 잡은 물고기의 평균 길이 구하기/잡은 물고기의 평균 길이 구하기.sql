-- 코드를 작성해주세요
select round(AVG(IFNULL(length,'10')),2) as average_length
from fish_info;