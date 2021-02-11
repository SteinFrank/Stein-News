package com.example.steinnews;

import com.example.steinnews.models.Article;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GsonTest {

    String json = "[\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"fox-news\",\n" +
            "        \"name\": \"Fox News\"\n" +
            "      },\n" +
            "      \"author\": \"Melissa Roberto\",\n" +
            "      \"title\": \"'Game of Thrones' star Esme Bianco claims Marilyn Manson cut her torso with a knife, chased her with axe - Fox News\",\n" +
            "      \"description\": \"Esme Bianco is the latest woman to come forward with allegations of abuse against rocker Marilyn Manson.\",\n" +
            "      \"url\": \"https://www.foxnews.com/entertainment/game-of-thrones-esme-bianco-marilyn-manson-abuse-claims-knife-torso-axe\",\n" +
            "      \"urlToImage\": \"https://static.foxnews.com/foxnews.com/content/uploads/2021/02/esme-bianco-getty.jpg\",\n" +
            "      \"publishedAt\": \"2021-02-11T15:28:57Z\",\n" +
            "      \"content\": \"Esme Bianco is the latest woman to come forward with allegations of abuse against rocker Marilyn Manson.\\r\\nThe \\\"Game of Thrones\\\" actress spoke up about her past experiences with Manson in an interview… [+6808 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"cnn\",\n" +
            "        \"name\": \"CNN\"\n" +
            "      },\n" +
            "      \"author\": \"Carma Hassan, CNN\",\n" +
            "      \"title\": \"At least 3 dead in 70-vehicle wreck due to weather in Fort Worth, Texas, police say - CNN\",\n" +
            "      \"description\": \"At least 70 vehicles were involved in a crash in the Texas city of Fort Worth on Thursday morning, leaving at least three people dead -- and poor weather was a factor -- police said.\",\n" +
            "      \"url\": \"https://www.cnn.com/2021/02/11/us/texas-fort-worth-crash/index.html\",\n" +
            "      \"urlToImage\": \"https://cdn.cnn.com/cnnnext/dam/assets/210211093646-01-fort-worth-interstate-accident-super-tease.jpg\",\n" +
            "      \"publishedAt\": \"2021-02-11T15:28:00Z\",\n" +
            "      \"content\": \"(CNN)At least 70 vehicles were involved in a crash in the Texas city of Fort Worth on Thursday morning, leaving at least three people dead -- and poor weather was a factor -- police said.\\r\\nThe wreck … [+1183 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"cnn\",\n" +
            "        \"name\": \"CNN\"\n" +
            "      },\n" +
            "      \"author\": \"Anneken Tappe, CNN Business\",\n" +
            "      \"title\": \"Another 793,000 Americans filed for initial unemployment benefits last week - CNN\",\n" +
            "      \"description\": \"America's unemployment crisis shows no signs of letting up.\",\n" +
            "      \"url\": \"https://www.cnn.com/2021/02/11/economy/coronavirus-unemployment-benefits/index.html\",\n" +
            "      \"urlToImage\": \"https://cdn.cnn.com/cnnnext/dam/assets/210210154749-02-us-unemployment-coronavirus-super-tease.jpg\",\n" +
            "      \"publishedAt\": \"2021-02-11T15:14:00Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"google-news\",\n" +
            "        \"name\": \"Google News\"\n" +
            "      },\n" +
            "      \"author\": null,\n" +
            "      \"title\": \"Nintendo Switch My Way – Weekend Getaway - Nintendo\",\n" +
            "      \"description\": null,\n" +
            "      \"url\": \"https://news.google.com/__i/rss/rd/articles/CBMiK2h0dHBzOi8vd3d3LnlvdXR1YmUuY29tL3dhdGNoP3Y9eVB1aWNwbW1vcGfSAQA?oc=5\",\n" +
            "      \"urlToImage\": null,\n" +
            "      \"publishedAt\": \"2021-02-11T15:11:40Z\",\n" +
            "      \"content\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"New York Post\"\n" +
            "      },\n" +
            "      \"author\": \"Emily Jacobs\",\n" +
            "      \"title\": \"Biden administration opens another tent city to detain surge of illegal migrants - New York Post \",\n" +
            "      \"description\": \"The Biden administration is facing fresh spikes of over 200 percent from this time last year in illegal border crossings and has now opened another tent city to detain illegal immigrants in Texas, …\",\n" +
            "      \"url\": \"https://nypost.com/2021/02/11/biden-admini-opens-tent-city-to-detain-illegal-migrants/\",\n" +
            "      \"urlToImage\": \"https://nypost.com/wp-content/uploads/sites/2/2021/02/texas-tent-city-1.jpg?quality=90&strip=all&w=1200\",\n" +
            "      \"publishedAt\": \"2021-02-11T15:10:00Z\",\n" +
            "      \"content\": \"The Biden administration is facing fresh spikes of over 200 percent from this time last year in illegal border crossings and has now opened another tent city to detain illegal immigrants in Texas, US… [+2613 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"engadget\",\n" +
            "        \"name\": \"Engadget\"\n" +
            "      },\n" +
            "      \"author\": \"https://www.engadget.com/about/editors/james-trew\",\n" +
            "      \"title\": \"Deadeus Game Boy horror game - Engadget\",\n" +
            "      \"description\": \"You're having a nightmare. So is everyone else? Something's up in the village and only you can save everyone in this new title for Game Boy.\",\n" +
            "      \"url\": \"https://www.engadget.com/deadeus-original-horror-game-boy-150040973.html\",\n" +
            "      \"urlToImage\": \"https://s.yimg.com/uu/api/res/1.2/mB.2wD3AwSArqDVhBK76uQ--~B/aD02NTM7dz05ODA7YXBwaWQ9eXRhY2h5b24-/https://s.yimg.com/os/creatr-uploaded-images/2021-02/7c019db0-6c7b-11eb-9573-9c59c1119d28\",\n" +
            "      \"publishedAt\": \"2021-02-11T15:04:33Z\",\n" +
            "      \"content\": \"Who doesnt love a game with a bit of atmosphere? Deadeus (pronounced deddyoos) is an indie horror title for the original Game Boy or emulators thereof and it has it in spades. The game has been avail… [+6197 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"ign\",\n" +
            "        \"name\": \"IGN\"\n" +
            "      },\n" +
            "      \"author\": \"Joe Skrebels\",\n" +
            "      \"title\": \"Stolen CD Projekt Red Files Reportedly Now Sold After Dark Web Auction - IGN - IGN\",\n" +
            "      \"description\": \"Files stolen from CD Projekt Red in a ransomware attack revealed earlier this week have reportedly now been sold in a dark web auction.\",\n" +
            "      \"url\": \"https://www.ign.com/articles/stolen-cd-projekt-red-files-reportedly-sold-on-dark-web-auction\",\n" +
            "      \"urlToImage\": \"https://assets1.ignimgs.com/2021/02/11/cdpr-hack-blog-1613052365345.jpg?width=1280\",\n" +
            "      \"publishedAt\": \"2021-02-11T15:00:00Z\",\n" +
            "      \"content\": \"Files stolen from CD Projekt Red in a ransomware attack revealed earlier this week have reportedly now been sold in a dark web auction.Dark web monitoring organisation KELA (which previously provided… [+3080 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"fox-news\",\n" +
            "        \"name\": \"Fox News\"\n" +
            "      },\n" +
            "      \"author\": \"Alexandria Hein\",\n" +
            "      \"title\": \"Fully vaccinated persons don’t need to quarantine post-coronavirus exposure, CDC says - Fox News\",\n" +
            "      \"description\": \"The Centers for Disease Control and Prevention (CDC) on Wednesday said that those who are fully vaccinated against coronavirus and who “meet criteria” will no longer be required to quarantine following exposure to someone with COVID-19.\",\n" +
            "      \"url\": \"https://www.foxnews.com/health/fully-vaccinated-persons-dont-need-to-quarantine-post-coronavirus-exposure-cdc-says\",\n" +
            "      \"urlToImage\": \"https://static.foxnews.com/foxnews.com/content/uploads/2021/02/quarantine_istock.jpg\",\n" +
            "      \"publishedAt\": \"2021-02-11T14:58:48Z\",\n" +
            "      \"content\": \"The Centers for Disease Control and Prevention (CDC) on Wednesday said that those who are fully vaccinated against coronavirus and who \\\"meet criteria\\\" will no longer be required to quarantine followi… [+2340 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"ESPN\"\n" +
            "      },\n" +
            "      \"author\": \"Michael Rothstein\",\n" +
            "      \"title\": \"Matthew Stafford says trade request from Detroit Lions was 'hardest conversation I've ever had,' surprised he landed with Los Angeles Rams - ESPN\",\n" +
            "      \"description\": \"Matthew Stafford, in his first public comments since being dealt to the Rams, said his trade request from the Lions was \\\"probably the hardest conversation I've ever had in my life\\\" and admitted he was not expecting to be traded to Los Angeles.\",\n" +
            "      \"url\": \"https://www.espn.com/nfl/story/_/id/30880411/matthew-stafford-says-trade-request-detroit-lions-was-hardest-conversation-ever-had-surprised-landed-los-angeles-rams\",\n" +
            "      \"urlToImage\": \"https://a3.espncdn.com/combiner/i?img=%2Fphoto%2F2020%2F1105%2Fr770943_2_1296x729_16%2D9.jpg\",\n" +
            "      \"publishedAt\": \"2021-02-11T14:55:45Z\",\n" +
            "      \"content\": \"Matthew Stafford said his decision to request a trade from the Detroit Lions, where he had spent his entire career, was \\\"probably the hardest conversation I've ever had in my life.\\\"\\r\\nStafford spoke t… [+2985 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"NPR\"\n" +
            "      },\n" +
            "      \"author\": \"Bill Chappell\",\n" +
            "      \"title\": \"Lucasfilm Ditches Gina Carano From 'The Mandalorian' Over Social Media Posts - NPR\",\n" +
            "      \"description\": \"The action star came under fire for saying today's political climate in the U.S. is similar to Nazi Germany's treatment of Jews.\",\n" +
            "      \"url\": \"https://www.npr.org/2021/02/11/966826718/lucasfilm-fires-gina-carano-from-the-mandalorian-over-social-media-posts\",\n" +
            "      \"urlToImage\": \"https://media.npr.org/assets/img/2021/02/11/gina-carano-star-wars_wide-52c3e26ee15cf998aa0a4c1e5a0e27d61e3e513e.jpg?s=1400\",\n" +
            "      \"publishedAt\": \"2021-02-11T14:49:42Z\",\n" +
            "      \"content\": \"Gina Carano is no longer part of the cast of The Mandalorian,with Lucasfilm calling her recent social media posts \\\"abhorrent.\\\"\\r\\nJean Baptiste Lacroix/Getty Images\\r\\nLucasfilm has fired Gina Carano fro… [+2793 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"WGN TV Chicago\"\n" +
            "      },\n" +
            "      \"author\": \"WGN-TV\",\n" +
            "      \"title\": \"Chicago, Cook County will not join rest of Illinois in expanding Phase 1B eligibility for COVID-19 vaccine - WGN TV Chicago\",\n" +
            "      \"description\": \"CHICAGO — The City of Chicago along with the rest of Cook County will not join the rest of the State of Illinois in expanding Phase 1B eligibility for the COVID-19 vaccine. In a joint statement, Mayor Lori Lightfoot and Cook County Board President Toni Preckw…\",\n" +
            "      \"url\": \"https://wgntv.com/news/chicago-cook-county-will-not-join-rest-of-illinois-in-expanding-phase-1b-eligibility-for-covid-19-vaccine/\",\n" +
            "      \"urlToImage\": \"https://wgntv.com/wp-content/uploads/sites/5/2021/01/96efb8355359468a8209652cd0f6337c-2.jpg?w=1280\",\n" +
            "      \"publishedAt\": \"2021-02-11T14:37:00Z\",\n" +
            "      \"content\": \"CHICAGO The City of Chicago along with the rest of Cook County will not join the rest of the State of Illinois in expanding Phase 1B eligibility for the COVID-19 vaccine.\\r\\nIn a joint statement, Mayor… [+2142 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"Minneapolis Star Tribune\"\n" +
            "      },\n" +
            "      \"author\": \"Kristen Leigh Painter\",\n" +
            "      \"title\": \"Hormel buys Planters nuts business from Kraft Heinz for $3.3 billion - Minneapolis Star Tribune\",\n" +
            "      \"description\": \"It's the biggest deal Hormel has ever made and will add more than $1 billion\",\n" +
            "      \"url\": \"https://www.startribune.com/hormel-buys-planters-nuts-business-from-kraft-heinz-for-3-3-billion/600021792/\",\n" +
            "      \"urlToImage\": \"https://chorus.stimg.co/22297123/ows_c4dfa75d_8b9d_4e10_9782_d8a46e10b099.jpg?h=630&w=1200&fit=crop&bg=999&crop=faces\",\n" +
            "      \"publishedAt\": \"2021-02-11T14:36:17Z\",\n" +
            "      \"content\": \"Hormel Foods Corp. is purchasing Planters for $3.35 billion, the largest acquisition in the Minnesota food company's 130-year history.\\r\\nThe Austin, Minn.-based food company known for its conservative… [+3769 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"cnn\",\n" +
            "        \"name\": \"CNN\"\n" +
            "      },\n" +
            "      \"author\": \"Veronica Stracqualursi and Mary Kay Mallonee, CNN\",\n" +
            "      \"title\": \"Former Republican officials float possibility of forming 'center-right' party - CNN\",\n" +
            "      \"description\": \"A group of more than 100 former Republican officials have discussed the possibility of forming a conservative party due to their unhappiness with the direction of the GOP under former President Donald Trump and the likelihood he'll be acquitted at the end of …\",\n" +
            "      \"url\": \"https://www.cnn.com/2021/02/11/politics/republican-officials-discuss-forming-party/index.html\",\n" +
            "      \"urlToImage\": \"https://cdn.cnn.com/cnnnext/dam/assets/210211064128-screengrab-charlie-dent-cnn-0211-super-tease.jpg\",\n" +
            "      \"publishedAt\": \"2021-02-11T14:36:00Z\",\n" +
            "      \"content\": \"(CNN)A group of more than 100 former Republican officials have discussed the possibility of forming a conservative party due to their unhappiness with the direction of the GOP under former President … [+5093 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"cbs-news\",\n" +
            "        \"name\": \"CBS News\"\n" +
            "      },\n" +
            "      \"author\": \"Melissa Quinn, Kathryn Watson, Grace Segers and Stefan Becket\",\n" +
            "      \"title\": \"Democrats use new video, Trump tweets to show \\\"full scope\\\" of Capitol attack at impeachment trial - CBS News\",\n" +
            "      \"description\": \"House impeachment managers showed new surveillance videos showing the mob storming the Capitol.\",\n" +
            "      \"url\": \"https://www.cbsnews.com/live-updates/trump-impeachment-trial-video-capitol-attack/\",\n" +
            "      \"urlToImage\": \"https://cbsnews1.cbsistatic.com/hub/i/r/2021/02/10/06393edd-f804-4a64-aa67-f5d55b0b10c2/thumbnail/1200x630/a11b24a137e8555dacc8b56a9297bbd6/screen-shot-2021-02-10-at-3-48-51-pm.png\",\n" +
            "      \"publishedAt\": \"2021-02-11T14:34:00Z\",\n" +
            "      \"content\": \"Delegate Stacey Plaskett of the U.S. Virgin Islands highlighted previous acts from Mr. Trump's supporters who then traveled to Washington on January 6, arguing the former president was aware of the v… [+4418 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"the-wall-street-journal\",\n" +
            "        \"name\": \"The Wall Street Journal\"\n" +
            "      },\n" +
            "      \"author\": \"Sarah McFarlane\",\n" +
            "      \"title\": \"Shell Hits Its Own Peak Oil, Plans to Reduce Output - The Wall Street Journal\",\n" +
            "      \"description\": \"Energy giant joins peers it pledging to reduce its dependence on fossil fuels while tapping the growing electricity market\",\n" +
            "      \"url\": \"https://www.wsj.com/articles/shell-hits-its-own-peak-oil-plans-to-reduce-output-11613042962\",\n" +
            "      \"urlToImage\": \"https://images.wsj.net/im-297953/social\",\n" +
            "      \"publishedAt\": \"2021-02-11T14:32:00Z\",\n" +
            "      \"content\": \"LONDON Royal Dutch Shell PLC said it would start reducing oil production, calling an end to a decades-old strategy centered on pumping more hydrocarbons as it and other energy giants seek to capitali… [+1760 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"CNBC\"\n" +
            "      },\n" +
            "      \"author\": \"Samantha Subin\",\n" +
            "      \"title\": \"Bumble IPO: The female founder behind the dating app making market history - CNBC\",\n" +
            "      \"description\": \"Bumble found business success with its female-focused dating algorithm, now the women behind the app including CEO Whitney Wolfe Herd are making IPO history.\",\n" +
            "      \"url\": \"https://www.cnbc.com/2021/02/11/bumble-ipo-the-woman-behind-dating-app-making-market-history.html\",\n" +
            "      \"urlToImage\": \"https://image.cnbcfm.com/api/v1/image/105948409-1559661437794gettyimages-929910656.jpeg?v=1613062369\",\n" +
            "      \"publishedAt\": \"2021-02-11T14:30:00Z\",\n" +
            "      \"content\": \"Founder and CEO of Bumble Whitney Wolfe\\r\\nWhen Bumble founder and CEO Whitney Wolfe Herd launched the dating app in 2014, she wanted to solve a real-world 21st century relationship problem: how to fin… [+12937 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"NPR\"\n" +
            "      },\n" +
            "      \"author\": \"Scott Neuman\",\n" +
            "      \"title\": \"New Virus Strains Could 'Destroy' Progress Against COVID-19, Merkel Says : Coronavirus Updates - NPR\",\n" +
            "      \"description\": \"The German chancellor defended her government's decision to extend a COVID-19 lockdown into March, as she issued a stark warning about fast-spreading new strains.\",\n" +
            "      \"url\": \"https://www.npr.org/sections/coronavirus-live-updates/2021/02/11/966823691/germanys-merkel-warns-coronavirus-variants-could-destroy-gains-against-pandemic\",\n" +
            "      \"urlToImage\": \"https://media.npr.org/assets/img/2021/02/11/gettyimages-1231097827_wide-bf099d207a219d583d9ab7ade91ffa8808fad223.jpg?s=1400\",\n" +
            "      \"publishedAt\": \"2021-02-11T14:18:37Z\",\n" +
            "      \"content\": \"German Chancellor Angela Merkel addresses the Bundestag in Berlin on the German government's measures against COVID-19 on Thursday.\\r\\nAnadolu Agency/Anadolu Agency via Getty Images\\r\\nGerman Chancellor … [+2337 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": null,\n" +
            "        \"name\": \"New York Times\"\n" +
            "      },\n" +
            "      \"author\": \"Joe Coscarelli\",\n" +
            "      \"title\": \"Taylor Swift’s Rerecorded Album Releases Begin With ‘Fearless’ in April - The New York Times\",\n" +
            "      \"description\": \"After her first six albums were sold to investors, Swift said she would record entirely new versions of her old songs that she would own.\",\n" +
            "      \"url\": \"https://www.nytimes.com/2021/02/11/arts/music/taylor-swift-rerecord-fearless.html\",\n" +
            "      \"urlToImage\": \"https://static01.nyt.com/images/2021/02/11/arts/11taylor/11taylor-facebookJumbo.jpg\",\n" +
            "      \"publishedAt\": \"2021-02-11T13:28:00Z\",\n" +
            "      \"content\": \"In 2019, not long after Swift signed a different contract with Universal Music Group that gave her the rights to her masters moving forward, the powerful music executive Scooter Braun purchased Big M… [+1208 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"fox-news\",\n" +
            "        \"name\": \"Fox News\"\n" +
            "      },\n" +
            "      \"author\": \"Peter Aitken\",\n" +
            "      \"title\": \"Rep. Nunes: Republicans could possibly face 'pressure' to impeach Biden if they take back House in 2022 - Fox News\",\n" +
            "      \"description\": \"California Rep. Devin Nunes, R-Calif., believes that Republicans might face pressure to impeach President Biden should the party gain control of the House in the 2022 midterms.\",\n" +
            "      \"url\": \"https://www.foxnews.com/politics/nunes-republicans-pressure-impeach-biden-house-2022\",\n" +
            "      \"urlToImage\": \"https://static.foxnews.com/foxnews.com/content/uploads/2021/01/devin-nunes.jpg\",\n" +
            "      \"publishedAt\": \"2021-02-11T13:13:15Z\",\n" +
            "      \"content\": \"California Rep. Devin Nunes, R-Calif., believes that Republicans might face pressure to impeach President Biden should the party gain control of the House in the 2022 midterms. \\r\\nThe aftermath of the… [+2113 chars]\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"source\": {\n" +
            "        \"id\": \"cbs-news\",\n" +
            "        \"name\": \"CBS News\"\n" +
            "      },\n" +
            "      \"author\": \"Kathryn Watson\",\n" +
            "      \"title\": \"Officer Eugene Goodman directed Senator Mitt Romney to safety as rioters breached Capitol, new video shows - CBS News\",\n" +
            "      \"description\": \"\\\"I look forward to thanking him when I next see him,\\\" Romney told reporters.\",\n" +
            "      \"url\": \"https://www.cbsnews.com/news/eugene-goodman-mitt-romney-new-video-impeachment-trial-day-2/\",\n" +
            "      \"urlToImage\": \"https://cbsnews1.cbsistatic.com/hub/i/r/2021/02/10/b1146987-a48b-4736-b60c-239057f1f6b2/thumbnail/1200x630/9f236eb9c6d7755589c52eb6dbe72218/screen-shot-2021-02-10-at-5-04-27-pm.png\",\n" +
            "      \"publishedAt\": \"2021-02-11T12:57:00Z\",\n" +
            "      \"content\": \"New security footage of the Capitol assault presented Wednesday by House impeachment managers showed Officer Eugene Goodman directing Senator Mitt Romney to turn to safety on January 6. Romney appear… [+2563 chars]\"\n" +
            "    }\n" +
            "]";

    @Test
    public void testSerialization(){
        Gson gson = new GsonBuilder().setLenient().create();
        Article[] articles = gson.fromJson(json, Article[].class);
        assertEquals(20, articles.length);

        Article article = articles[19];
        assertEquals(article.getAuthor(), "Kathryn Watson");
        assertEquals(article.getTitle(), "Officer Eugene Goodman directed Senator Mitt Romney to safety as rioters breached Capitol, new video shows - CBS News");
        assertEquals(article.getDescription(), "\"I look forward to thanking him when I next see him,\" Romney told reporters.");
        assertEquals(article.getUrl(), "https://www.cbsnews.com/news/eugene-goodman-mitt-romney-new-video-impeachment-trial-day-2/");
        assertEquals(article.getUrlToImage(), "https://cbsnews1.cbsistatic.com/hub/i/r/2021/02/10/b1146987-a48b-4736-b60c-239057f1f6b2/thumbnail/1200x630/9f236eb9c6d7755589c52eb6dbe72218/screen-shot-2021-02-10-at-5-04-27-pm.png");
        assertEquals(article.getPublishedAt(), "2021-02-11T12:57:00Z");
        //TODO = Missing content field.
    }
}
