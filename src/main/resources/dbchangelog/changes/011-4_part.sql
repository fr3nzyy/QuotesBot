--liquibase formatted sql

--changeset fr3nzy:4_part
INSERT INTO public.quotes (id, text, original_text, author, book_name, description, hash, created_at, updated_at,
                           status, priority)
VALUES (gen_random_uuid(),
        'Гораздо чаще ситуации, когда женщины в своих эмоциональных проблемах обвиняют мужчину, чем когда мужчины в этих проблемах обвиняет женщин',
        '', 'Анатолий Добин', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(), 'Место в голове женщины в отношениях с мужчинами имеет её фантазия', '', 'Анатолий Добин',
        '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(),
        'Чтобы вступить в отношения с мужчиной, женщина должна им как-то очароваться, даже ценой самообмана, увидеть на месте заурядного мужчины принца. Правда, не редко, в дальнейшем приходит разочарование от таких отношений',
        '', 'Анатолий Добин', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(),
        'Проблема в том, что счастье на самом деле является невозможным нарциссическим миражом. Мираж полного и тотального удовлетворения',
        '', 'Анатолий Добин', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(), 'В нашей психике счастье - всегда невозможный горизонт абсолютного удовлетворения', '',
        'Анатолий Добин', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(),
        'Многие нарциссические мужчины, мужчины яркие, которые всё время требуют восхищения собой, ведут себя так, потому что за этим в глубине их души стоит обида. Они компенсируют свою внутреннюю уязвлённость тем, что всё время требуют к себе внимания и любви',
        '', 'Анатолий Добин', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(),
        'Часто наше желание в отношениях, это не сам партнёр, а его желание, объектом которого мы являемся', '',
        'Анатолий Добин', '', '', 0, now(), now(), 'UNREAD', 100);