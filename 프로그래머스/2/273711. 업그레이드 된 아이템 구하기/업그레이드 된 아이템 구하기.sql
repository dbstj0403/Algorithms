SELECT II.ITEM_ID, II.ITEM_NAME, II.RARITY
FROM ITEM_INFO AS II
JOIN ITEM_TREE AS IT
ON II.ITEM_ID = IT.ITEM_ID
WHERE IT.PARENT_ITEM_ID IN (SELECT IT.ITEM_ID FROM ITEM_TREE AS IT JOIN ITEM_INFO AS II ON II.ITEM_ID = IT.ITEM_ID WHERE II.RARITY = 'RARE')
ORDER BY II.ITEM_ID DESC

