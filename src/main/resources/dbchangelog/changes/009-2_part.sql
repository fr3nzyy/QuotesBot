--liquibase formatted sql

--changeset fr3nzy:2nd_part_after_ne-richite_na_sobaku
INSERT INTO public.quotes (id, text, original_text, author, book_name, description, hash, created_at, updated_at,
                           status, priority)
VALUES (gen_random_uuid(),
        'Чтобы вступить в отношения с мужчиной, женщина должна им как-то очароваться, даже ценой самообмана. Увидеть на месте заурядного мужчины принца. Правда, часто, в дальнейшем приходит разочарование',
        '', 'Анатолий Добин', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(),
        'Проблема в том, что счастье на самом деле является невозможным нарциссическим миражом. Мираж полного и тотального удовлетворения',
        '', 'Анатолий Добин', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(), 'В нашей психике счастье - всегда невозможный горизонт абсолютного удовлетворения', '',
        'Анатолий Добин', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(),
        'У дельфинов поддержать поведение поможет случайное подкрепление первого или второго  прыжка, помимо шестого. У людей могут быть эффективны различные виды прогрессивных оплат или других подкреплений (например, награды),  тесно связанные с качеством и количеством продукции и выдаваемые неодновременно с обычным подкреплением. Применяя либо фиксированный, либо вариативный режимы подкрепления можно оттренировать чрезвычайно длинные цепи поведенческих реакций. Можно добиться того, что цыпленок будет клевать кнопку сто и более  раз  за каждое зернышко пшеницы.  Для  людей  также  можно  привести  много  примеров  отставленного вознаграждения.   Один  психолог  шутит,   что   самым   длительным  режимом неподкрепляемого поведения в человеческой жизни является учеба в школе.',
        '', 'Карен Прайор', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(),
        'Другое явление,  встречающееся  при  очень длительных интервалах  между подкреплениями, -  замедленный старт. Начав клевать, цыпленок  совершает эти действия с  постоянной  частотой,  так  как  каждый удар  приближает  его  к подкреплению,  но  было  отмечено,  что  по  мере  того,  как  увеличиваются интервалы  между  подкреплениями,  он стремится "отложить" начало реакции на более  длительный срок.  Это  и называется "отсроченное  начало  поведения с долговременной программой" и  очень распространено  в жизни людей.  В  любой долгосрочной  задаче,  начиная с  уплаты подоходного налога и кончая уборкой гаража, можно  придумать бесконечное количество  причин  для того, чтобы  не начать дело безотлагательно. Написание чего-либо, иногда даже просто письма, тоже поведение с долгосрочной программой. Когда оно уже начато, все идет прекрасно. Но так трудно заставить себя сесть и начать! Джейме Турбер  находил, что начать статью настолько трудно, что иногда он  обманывал свою жену (которая по понятным причинам была  чрезвычайно заинтересована  в  том,  чтобы он писал  статьи, так как доход с них  шел на оплату квартиры), лежа все утро на диване в  кабинете  и читая  книгу, которую он держал  в одной  руке, а другой стучал по клавишам пишущей машинки. Феномен отстроченного начала перевешивал явное  положительное  подкрепление в виде денег,  а симуляция  печатанья  на машинке, по  крайней мере, предотвращала отрицательное подкрепление  упреков жены. Один из способов преодоления феномена отсроченного начала заключается в том, чтобы вводить какое-либо подкрепление именно  за старт, так  же,  как я  эпизодически  подкрепляю у своих дельфинов первый или второй  прыжок в серии из шести. Я успешно применяла этот прием и в самовоспитании.',
        '', 'Карен Прайор', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(),
        'Интересно,  что  суеверное  поведение  не   исчезает,  если  вы  просто указываете  на  его  неэффективность;  будучи  очень  сильно заученным,  оно соответственно  сильно оберегается. Попробуйте поговорить  с  врачом  о  его привычке использовать неэффективное или даже вредное  лечение, и вы получите отпор в соответствующих выражениях; я уверена, что и тот бейсболист с девятиступенчатым  суеверным  выражением нервного  возбуждения  будет яростно противиться всякому,  кто предложит  ему  играть в мяч,  скажем, без кепки, до которой он четырежды дотрагивается. Единственный способ избавиться от суеверного поведения - это убедиться, что оно не связано с подкреплением.',
        '', 'Карен Прайор', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(), '"Подражание в природе свойственно  некоторым животным и птицам, а  также людям. Молодые  особи всех видов учатся большинству из того, что  они должны знать, наблюдая, а затем копируя поведение старших. В то время как психологи часто   считают  ""обучение  при  помощи  наблюдения""   признаком  разумности животного  -  у приматов  оно хорошо выражено,  у  некоторых других животных плохо, я  думаю, что наличие или отсутствие этой способности  у того или иного вида зависит  от его экологии, т.е. ее роли в естественных условиях жизни, а не  разума как  такового.  У некоторых  птиц способность подражать поведению выражена чрезвычайно сильно. В Англии синицы выучились открывать оставляемые у дверей молочные  бутылки, доставать из  них сливки,  этот  навык с помощью подражания с такой быстротой распространился,  что крышки  молочных бутылок пришлось   переделывать.
     Собаки мало способны к обучению при наблюдении; когда они делают то же, что и другие собаки,  то  обычно это потому, что  отвечают  на  одни и  те  же  стимулы, а не потому, что подражают.  С  другой  стороны, кошки,  которые, согласно мнению зоопсихологов, имеют   более   низкий  уровень  умственных   способностей, прекрасные подражатели. Выражение ""copycat""* неслучайно.  Если  вы  обучаете какому-либо трюку - скажем, звонить в колокольчик, чтобы пустили в дом, одну из кошек в доме, то и другие  кошки  вполне  могут этому научиться  без вашего обучения."',
        '', 'Карен Прайор', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(), '"Я думаю,  что  важное значение теории подкрепления для общества состоит не  в   изменении  отдельных  видов  поведения  или  реформировании  учебных заведений, а  в  том влиянии, которое  само по себе оказывает  положительное подкрепление  на  отдельных  индивидов.   Подкрепление  -   это  информация, информация о том, что то, что вы делаете, приводит к результату.  Если у нас есть информация о том, как заставить окружающую среду подкреплять нас, значит, мы эту среду контролируем, и мы больше ей неподвластны. В самом деле от успешности этого до некоторой  степени зависит наше приспособление к жизни, достигнутое в ходе эволюции.
     Таким  образом, индивидам нравится  обучаться с помощью подкрепления не
по тем причинам, которые лежат  на поверхности - получение  пищи или другого
вознаграждения, а потому, что они в   этом  процессе   действительно   обретают  некоторый  контроль  над происходящим. А причина того, что людям нравится изменять поведение других  с  помощью  подкрепления, состоит в том, что  ответная реакция доставляет  удовольствие. Глядя  на то, как радуются животные, как  сияют глаза малышей, люди  расцветают и начинают сиять  -  от  радости,  вызванной  успешностью   собственных  усилий;   этот положительный результат сам по себе является мощным подкреплением. Некоторых людей возможность получения хороших результатов захватывает полностью."',
        '', 'Карен Прайор', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(),
        'Поведение, которое уже встречается вне зависимости от того, насколько оно спорадично, всегда можно усилить с помощью положительного подкрепления. Если вы зовете щенка, и он подходит к вам, а вы его ласкаете, то в дальнейшем подход щенка на зов становится все более и более надежным даже безо всякого другого обучения. Предположим, что вы хотите, чтобы кто-то позвонил вам — ваш отпрыск, родитель или любимый. Если он или она не звонит, то тогда уж ничего не поделаешь. Самое главное в обучении с подкреплением то, что вы не можете подкрепить поведение, которое не встречается. С другой стороны, если вы всегда проявляете радость, когда любимые вам звонят, то это значит что их поведение положительно подкрепляется, вероятность частоты их звонков, очевидно, увеличится. Конечно, если вы примените отрицательное подкрепление — "Почему ты не позвонил, почему я должна тебе звонить, ты мне никогда не звонишь" и т. д., замечания, которые вызывают раздражение, — вы создаете ситуацию, при которой звонящий избегает неприятностей тем, что не звонит; фактически вы обучаете их не звонить. Простое введение положительного подкрепления за поведение является наиболее элементарной частью этого вида обучения. В научной психологической литературе встречаются такие выражения: "Были использованы поведенческие методики" или "Проблема была решена с помощью поведенческого подхода".',
        '', 'Карен Прайор', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(), '"Кстати, например, наиболее действенный способ приучить ребенка не мочиться в постель — лично похвалить его и выразить свое удовольствие, если утром простынки оказались сухими. Положительное подкрепление можно применить и к себе.
В Шекспировской студии, которую я в свое время посещала, я встретила юриста с Уолл-стрит, которому было под пятьдесят и который был страстным любителем игры в сквош (игра, в которую играют ракетками и мягким мячом в закрытых кортах). Однажды он услышал, как я рассказываю об обучении, и уходя заметил, что можно испробовать положительное подкрепление на его игре в сквош. Вместо того что бы как обычно сокрушаться об ошибках, он попробует воз награждать себя за хорошие удары.
Через две недели я снова встретила его. ""Как сквош?"" — спросила я. На его лице потаилось выражение заинтересованности и радости, что нечасто бывает с юристами с Уолл-стрит. ""Сначала я чувствовал себя жутким дураком, — ответил он, — говоря: ""Хорошо, Пит, молодец!"" при каждом удачном ударе. Черт возьми, когда я тренировался один, я даже поглаживал себя по спине. Но затем моя игра начала улучшаться. И сейчас я на четыре ранга выше в клубной лестнице, чем был когда-либо раньше. Я побеждаю тех, у которых прежде не мог выиграть даже очко. И получаю гораздо больше удовольствия.
С тех пор как я не ору на себя все время, я не кончаю игру злым и разочарованным. Если удар не получился, ничего страшного, следующие будут хорошими. И я обнаруживаю, что мне просто смешно, когда кто-нибудь другой делает ошибку, бесится, бросает ракетку — я знаю, что это не улучшит его игру, я только улыбаюсь. Какой жестокий противник. И это сразу же как только перешел на положительное подкрепление."',
        '', 'Карен Прайор', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(), '"Мне кажется, что иногда и детей мы подкрепляем слишком рано, находясь под ложным впечатлением, будто мы их подбадриваем (""Молодец, хорошо, ты уже почти все сделала правильно""). Возможно, при этом мы подкрепляем попытки. Но существует разница между попыткой сделать что-то и выполнением этого. Причитания типа ""я не могу"" иногда отражают фактическое положение вещей, но они могут являться и признаками того, что часто подкреплялись просто попытки. Вообще, подкрепление поведения, которое еще не совершилось, — подарками, обещаниями, комплиментами или чем-нибудь в этом роде — ни капельки не подкрепляет это поведение. Если что-то и подкрепляется, так это поведение, совершающееся в данное время: вероятнее всего — выпрашивание подкрепления. Соблюдение времени очень важно и при обучении с отрицательным подкреплением. Лошадь учится поворачивать налево, когда тянут за левый повод, но только если после поворота натяжение ослабевает. Прекращение натяжения является подкреплением. Вы садитесь на лошадь, пришпориваете ее, и она движется вперед — тогда вам надо перестать ее пришпоривать (если, конечно, вы не хотите, чтобы она двигалась быстрее). Начинающие наездники часто тычут лошадь в бока непрерывно, как будто шпоры это своего рода педаль газа в автомобиле, необходимая для движения. Пришпоривание не прекращается и тем самым не несет никакой информации для лошади. Так в школах верховой езды появляются лошади с железными боками, которые передвигаются черепашьим шагом независимо от того, как часто их пришпоривают.
То же происходит и с людьми, к которым постоянно придираются и бранят родители, начальство или учителя. Если отрицательное подкрепление не прекращается в момент достижения желаемых результатов, то оно не является подкреплением и не несет информации. Оно становится как буквально, так и в терминах теории информации ""шумом""."',
        '', 'Карен Прайор', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(),
        'Начинающие тренеры, использующие пищевое подкрепление при работе с животными, часто не знают, какова должна быть величина каждого подкрепления. Ответ таков: чем меньше, тем лучше. Чем меньше подкрепление, тем быстрее животное съест его. Это не только экономит время, но и позволяет дать большее количество подкреплений за один сеанс, прежде чем животное насытиться.',
        '', 'Карен Прайор', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(),
        'Конюшни, где я занималась, продавали билеты, каждый на десять уроков; по своим деньгам я могла позволить себе один билет в месяц. В то время я жила с отцом, Филиппом Уили, и мачехой, Рики; и хотя они относились ко мне очень хорошо, я вступила в один из тех периодов юности, когда беспрерывно целыми днями бываешь невыносимо грубым и противным. Однажды вечером супруги Уйди, которые были любящими и изобретательными родителями, сказали, что они ужасно устали от моего поведения и поэтому решили меня наградить. И они презентовали мне ослепительно новый, дополнительный бесплатный билет на верховую езду. Один из них не поленился съездить на конюшни, чтобы купить его. Поразительно! Незаслуженный куш. Как мне помнится, я с ходу переменилась, и Рики Уйди подтвердила это много лет спустя, когда я писала эту книгу.',
        '', 'Карен Прайор', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(),
        'Условное подкрепление представляет собой какой-либо изначально ничего незначащий сигнал — звук, свет, движение, — который умышленно связывают с подачей подкрепления. Тренеры дельфинов остановили свой выбор на полицейском свистке: его хорошо слышно даже под водой и он не связывает руки, чтобы можно было давать сигналы и бросать рыбу. С другими животными я обычно использую "сверчка", десятицентовую игрушку, которая щелкает, когда на нее нажимаешь, или особые поощряющие слова, выбранные и приберегаемые для использования в качестве условного подкрепления: "хорошая собака", "хорошая лошадка". Школьные учителя часто прибегают к некоторым таким ритуальным и тщательно нормированным словам похвалы — "замечательно" или "очень хорошо", — за которые дети страстно работают и ждут их. Наша жизнь изобилует условными подкреплениями. Нам нравится слышать, как звонит телефон или видеть набитый почтовый ящик, даже если половина звонков неинтересна и большая часть корреспонденции — утиль, потому что множество случаев научили нас связывать звонок или конверт с хорошим. Нам нравится рождественская музыка, и мы ненавидим запах зубного кабинета. Мы храним окружающие нас вещи — картины, посуду, трофеи — не потому, что они красивы или полезны, а потому, что они напоминают нам о временах, когда мы были счастливы, или о людях, которых мы любили. Они представляют собой условные подкрепления. Практически дрессировка животных с использованием положительного подкрепления почти всегда должна начинаться с выработки условного подкрепления. Прежде чем начать выработку поведения как такового, пока субъект еще ничего особенного и не делает, вы учите его понимать значимость условного подкрепления, сочетая его с пищей, поглаживанием иди другим истинным подкреплением.',
        '', 'Карен Прайор', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(),
        'Люди конечно же тоже могут бесконечно работать за деньги, являющиеся ничем иным как условным подкреплением, обозначением вещей, которые на них можно купить, особенно люди, которые уже заработали гораздо больше денег, чем они когда-либо смогут действительно потратить, и, следовательно, пристрастившиеся к условному подкреплению. Действие условного подкрепления можно усилить, сочетая его с несколькими безусловными подкреплениями. В данный момент субъект может не хотеть, скажем, есть, но если тот же подкрепляющий звук или слово были умышленно связаны еще и с водой или другими потребностями или приятными моментами, он сохраняет свое действие и в этом случае. Мои кошки слышат слова "хорошая киса!", когда получают ужин, когда их гладят, когда их впускают в дом и выпускают из дома, когда они проделывают маленькие трюки и получают за них вознаграждение. В результате я могу использовать эти слова для поощрения кошки, спрыгивающей с кухонного стола, и нет нужды сопровождать его каким-либо безусловным подкрепдением. Быть может, причина того, что деньги оказывают на нас такое подкрепляющее действие, кроется в том, "что они могут связываться практически с чем угодно. Это чрезвычайно обобщенное условное подкрепление. Как только вы выработали условное подкрепление, вы должны пользоваться им осторожно, не разбрасывать без толку, иначе его сила уменьшится.',
        '', 'Карен Прайор', '', '', 0, now(), now(), 'UNREAD', 100),
       (gen_random_uuid(), '"Бытует неправильный взгляд, что если вы начали вырабатывать поведение с помощью положительного подкрепления, то должны продолжать его применение на протяжении всей дельнейшей жизни субъекта, если этого не будет, то поведение исчезнет. Это неверно: постоянное под крепление необходимо только на стадиях обучения. Вы можете несколько раз вознаградить годовалого ребенка за пользование горшком, но как только поведение заучено, предмет обучения сам о себе позаботится. Мы даем или должны давать начинающему множество подкреплений — обучение ребенка езде на велосипеде идет под настоящий поток: ""Правильно, крепче держи руль, у тебя получилось, хорошо!"" Но вы будете выглядеть довольно глупо (а ребенок решит, что вы сошли с ума), если вы будете продолжать хвалить его после того как навык установился. Для того чтобы поддерживать уже выученное поведение на определенном уровне надежности, не только не надо подкреплять его все время, а даже, наоборот, следует прекратить регулярные подкрепления и перейти на эпизодическое использование подкрепления, подаваемого в случайном и не предсказуемом порядке. Это и есть то, что психологи называют вариабельным режимом подкрепления.
Вариабельный режим гораздо более эффективен для поддержания поведения, чем постоянный, предсказуемый. Один психолог объяснил это мне так: если у вас машина новая и всегда хорошо заводилась, а однажды, когда вы сели в нее, повернули ключ, она не завелась, то вы, может быть, и попробуете завести ее еще несколько раз, но скоро решите, что что-нибудь не в порядке, и позвоните в гараж. Поведение, состоящее в поворачивании ключа, при отсутствии ожидаемого немедленного подкрепления быстро угаснет. С другой стороны, если у вас вместо машины старая консервная банка, которая еще ни разу не заводилась с первой попытки, и каждый раз требуется целая вечность для того, чтобы привести ее в движение, вы можете продолжать попытки ее завести в течение получаса; ваше поведение по поворачиванию ключа происходит в низковероятностном режиме подкрепления и поэтому сильнейшим образом поддерживается. Если давать дельфину рыбку за каждый прыжок, то скоро прыжки станут невысокими, небрежными, лишь бы отделаться. Если теперь перестать давать рыбу, дельфин тут же перестает прыгать. Но, если после того как животное научилось прыгать за рыбку, начать подкреплять первый прыжок, затем третий и так далее наугад, поведение будет поддерживаться на более высоком уровне: не получив подкрепления, животное станет прыгать чаще, стараясь угадать счастливый номер, и прыжки могут даже усилиться. В свою очередь это позволит подкреплять выборочно наиболее сильные прыжки, — то есть посредством вариативного режима совершенствовать деятельность. Но даже некоторые профессиональные дрессировщики не могут правильно использовать вариативный режим положительного подкрепления; многим эта концепция представляется особенно трудной, не укладывающейся в голове. Нам понято, что нет нужды продолжать наказывать за неправильное поведение, если оно прекратилось, но почему бы не вознаграждать постоянно за правильное поведение."',
        '', 'Карен Прайор', '', '', 0, now(), now(), 'UNREAD', 100);