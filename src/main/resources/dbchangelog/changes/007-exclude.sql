--liquibase formatted sql

--changeset fr3nzy:add-priority
update quotes
set status = 'READ'
where id in ('bd458dbd-1295-432b-a75f-611aec1a8576', 'bf81b290-d79d-4d70-a6b1-1c7b6a365f2b',
             'adbdc3d2-2db8-4238-b09b-a3d93887fa25', '265678dd-69b5-4205-8893-36a350f0fd97',
             'ab517f73-16a3-4472-96ed-d152b8aa60e7');