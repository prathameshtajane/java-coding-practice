
USE `hospital_db`

SELECT *
FROM bed_fact_deduped as BFD
INNER JOIN business_deduped as BD
ON  BFD.ims_org_id=BD.ims_org_id
WHERE BFD.bed_id=4 OR BFD.bed_id=15;
