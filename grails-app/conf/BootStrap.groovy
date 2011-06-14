import grails.interview.task.Article
import grails.interview.task.Comment

class BootStrap {

    def init = { servletContext ->
        def article1 = new Article()
        article1.headline = "Teachers Vote To Walk Out In Pension Row"
        article1.imageUrl = "http://news.sky.com/sky-news/content/StaticFile/jpg/2011/Mar/Week4/15960612.jpg"
        article1.intro = "Teachers from two unions have overwhelmingly backed a national walkout in a row over pensions."
        article1.bodyText = """Members of both the National Union of Teachers (NUT) and the Association of Teachers and Lecturers (ATL) will walk out in protest at the changes the Government is planning to make to their pensions.
The unions say the plans will leave teachers working longer, paying more and receiving less when they retire.
A strike is now set to take place on June 30, affecting millions of children at schools in England and Wales.
Results from the NUT's ballot show that 92% were in favour of strike action.
Turnout was 40% among state school members of the union and 27% among private school members."""


        article1.addToComments(new Comment(commentText: """You have to laugh at these workshy's. You will not get any sympathy on here or in the real world where people are facing genuine hardship and uncertain futures. The same as you would have had if you were not so scared of the outside world and had actually left school. """))
        article1.addToComments(new Comment(commentText: """Approx 50% of the population either has no pension provision.. like me.. I am relying on inheritance.. or has a pension so poor it is not worth talking about.. We are going to have a lot of poor people in the next 20 years or so.. I have never liked teachers.. I liked school though.."""))
        article1.addToComments(new Comment(commentText: """Oh my heart bleeds for all you teachers!Holidays galore, decent pay and you don't pay that much in for your pension.I am a police officer, I get a set amount of days off for leave, I pay 11% pension now soon to go up to 15%, I don't have the right to strike either.
(Not that we would strike as we has morals and us striking will effect everyone)."""))
        article1.addToComments(new Comment(commentText: """All the posters saying they have no sympathy for teachers clearly don't have any idea what they're talking about. Coming from a family of teachers (I myself wise enough to avoid the profession), I can tell you how demanding and stressful a job it is (or should be, anyone not feeling the pressure is blatantly underperforming)."""))
        article1.addToComments(new Comment(commentText: """The cheek of people thinking they should get a decent pension and wages, dont they know they have immigration foreign aid and the eu to pay for you cant have it all, if you were one of the mugs that voted or still vote liblabcon then you deserve the above as i have known for years the damage these three main partys would and are doing to this country..."""))
        article1.addToComments(new Comment(commentText: """I think ive just realised why so many people are so upset with teachers. It's not because of what we are asking for and what is right it's because they've realised they'll have to sort out someone to look after their child when the strike in on. Try this one..... take time off and spend it with your families- God forbid!"""))
        article1.addToComments(new Comment(commentText: """samfly66 try being selfemployed and makeing a living for yourself. you get more holidays a year then any other proffesion. why should every other tom dick and jane work till sixty five . why should you teachers be different . """))

        assert article1.save(), "errors: ${article1.errors}"


        def article2 = new Article()
        article2.headline = "Syrian Tanks Push Towards Turkey And Iraq"
        article2.imageUrl = "http://news.sky.com/sky-news/content/StaticFile/jpg/2011/Jun/Week2/16011813.jpg"
        article2.intro = "Syrian tanks have pushed toward more towns near the Turkish and Iraqi borders, expanding the crackdown as more Syrians flee their homes."
        article2.bodyText = """President Bashar al Assad appears to have abandoned all pretence of offering reform, sending tanks, helicopter gunships and only his most loyal forces into population centres to crush dissent.
The latest action sees an expansion of force against the 12-week uprising in the north and east of Syria.
Anti-government activists reported tanks in the northern market town of Maaret al Numan and in smaller villages near Jisr al Shughour, a town stormed on Sunday by Syrian elite forces backed by helicopters."""

        article2.addToComments(new Comment(commentText: """Nobody will care. No oil involved!!"""))
        article2.addToComments(new Comment(commentText: """This isn't Breaking News??? Thousands of Syrians have fled their homes as refugees fearing the brutality of Assad. Thousands have died while this despot tightens his grip on his own people yet the comment boards are empty. No one seems to care....no calls from Amnesty, no human rights lobbyists, no screams for referral to the UN Security Council."""))

        assert article2.save(), "errors: ${article2.errors}"

        def article3 = new Article()
        article3.headline = "Two-Year-Old Boy Dies In E.coli Outbreak"
        article3.imageUrl = "http://news.sky.com/sky-news/content/StaticFile/jpg/2011/Jun/Week2/16011956.jpg"
        article3.intro = "A two-year-old boy has become the youngest victim of the deadly E.coli bacteria in Germany, the 37th person to die in the outbreak."
        article3.bodyText = """The child lost his battle with the killer bug after spending several days in intensive care at a hospital in the northern city of Hanover.
His father and two siblings also fell ill but were recovering, authorities said.
He is the first child fatality since the outbreak began in Germany in May.
A 20-year-old woman was previously the youngest victim linked to the epidemic, which authorities have blamed on bean sprouts and shoots from a German organic farm."""


        assert article3.save(), "errors: ${article3.errors}"


        def article4 = new Article()
        article4.headline = "Weekly Bin Collection Pledge Is Scrapped"
        article4.imageUrl = "http://news.sky.com/sky-news/content/StaticFile/jpg/2011/Apr/Week2/15969663.jpg"
        article4.intro = "Plans to reinstate weekly bin collections have been shelved by the Government after a row between Cabinet ministers."
        article4.bodyText = """Environment Secretary Caroline Spelman announced the findings of the Government's Waste Review - a cross-department examination of how to tackle waste.
It contains a u-turn on the Communities' Secretary Eric Pickles' pledge to bring back weekly rubbish collections.
Sky News understands Mr Pickles and Ms Spelman have clashed over the policy.
One Whitehall source told Sky News: "Defra officials have been trying to block all the bin policies from day one."
However, the Department for Environment claim they cannot force councils to reinstate weekly collections without giving them more money.
About 9.5 million households - almost half the homes in Britain - now have their general rubbish collected only every two weeks."""

        article4.addToComments(new Comment(commentText: """Where i used to live a neighbour of mine sent the council an invoice once a month for the "labour"of sorting his rubbish into seperate containers/bins at the minimum wage rate. Quite right this is what you pay council tax for//////them to sort it out."""))
        article4.addToComments(new Comment(commentText: """Of all the BASIC things in life..surely we cant get this wrong can we ?"""))
        article4.addToComments(new Comment(commentText: """Why should we the public sort rubbish for you for FREE,when i pay 1.8k a year council tax?"""))
        article4.addToComments(new Comment(commentText: """Take your rubbish and dump on the doorstep of your local tory member of parliament."""))
        article4.addToComments(new Comment(commentText: """We all know who to vote for next time, the only Party who isn't anti-British and who will put the interest's of this Country first."""))

        assert article4.save(), "errors: ${article4.errors}"

    }
    def destroy = {
    }
}
