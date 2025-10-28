# ROOT = PARENT_ITEM_ID NULL
# 희귀도가 레어인 아이템의 모든 다음 업그레이드 아이템의 정보.

SELECT A.ITEM_ID, A.ITEM_NAME, A.RARITY
FROM ITEM_INFO A
WHERE A.ITEM_ID IN (SELECT A.ITEM_ID
                                        FROM ITEM_TREE A
                                        JOIN ITEM_INFO B ON A.PARENT_ITEM_ID = B.ITEM_ID
                                        WHERE B.RARITY = 'RARE')
ORDER BY A.ITEM_ID DESC;
