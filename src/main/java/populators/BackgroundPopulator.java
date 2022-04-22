package populators;

import dtos.BackgroundAbilityDTO;
import dtos.BackgroundDTO;
import errorhandling.NotFoundException;
import facades.BackgroundAbilityFacade;
import facades.BackgroundFacade;
import utils.EMF_Creator;
import javax.persistence.EntityManagerFactory;

public class BackgroundPopulator {
    public static void main(String[] args) throws NotFoundException {
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        populateBackgrounds(emf);
    }

    public static void populateBackgrounds(EntityManagerFactory emf) throws NotFoundException {
        BackgroundFacade bFacade = BackgroundFacade.getBackgroundFacade(emf);
        BackgroundAbilityFacade baFacade = BackgroundAbilityFacade.getBackgroundAbilityFacade(emf);

        // Lejesoldat
        BackgroundDTO lejesoldat = new BackgroundDTO(
                "Lejesoldat",
                "Neutral Upartisk",
                "Lejesoldaten er en kold og kynisk kriger. De bruger deres viden inden for krigsførelse til at skabe en tilværelse domineret af kamp og konflikt. Dog er deres evner til at interagere med andre mennesker forværret, da krig sjældent tillader lange og meningsfulde samtaler.",
                "https://cdn.discordapp.com/attachments/910894864265269318/966585405447209000/Lejesoldat.png"
        );
        BackgroundDTO lejesoldatDTO = bFacade.create(lejesoldat);
        BackgroundAbilityDTO lejesoldatA1 = new BackgroundAbilityDTO(
                "Amatører...",
                "I kamp mod ‘Bandit’ og ‘Soldat’ slår Lejesoldaten altid med Fordel."
        );
        baFacade.create(lejesoldatA1, lejesoldatDTO);
        BackgroundAbilityDTO lejesoldatA2 = new BackgroundAbilityDTO(
                "Kampplan",
                "Ved mulighed kan Lejesoldaten give fif og råd til en medspiller.\n" +
                        "Dette skal ske under et Pusterum. Kampplan giver den anden spiller plus +10 i deres højeste Kamp Evne under HELE den næste kamp (Kan kun bruges på én spiller pr. kamp og hvis nogle Kamp Evner er lige, vælger spilleren selv)."
        );
        baFacade.create(lejesoldatA2, lejesoldatDTO);

        // Samarit
        BackgroundDTO samarit = new BackgroundDTO(
                "Samarit",
                "Pragmatisk Ideolog",
                "Omvandrende Samaritter plejer tit deres erhverv i krigshærgede eller lovløse områder. Oftest er de tidligere læger fra mindre landsbyer, eller simple godhjertede sjæle der er drevet til at hjælpe deres næste.",
                "https://cdn.discordapp.com/attachments/910894864265269318/966585559004885012/Samarit.png"
        );
        BackgroundDTO samaritDTO = bFacade.create(samarit);
        BackgroundAbilityDTO samaritA1 = new BackgroundAbilityDTO(
                "Ræk mig den kniv…",
                "Samaritten kan altid udøve Seriøs Lægehjælp så længe de er i besiddelse af almene medicinale effekter, bandager, gazebind etc."
        );
        baFacade.create(samaritA1, samaritDTO);
        BackgroundAbilityDTO samaritA2 = new BackgroundAbilityDTO(
                "Hvor gør det ondt?",
                "Samaritten kan, uden brug af Lægevidenskab, altid identificere eller opdage hvis en medspiller er forgiftet, syg eller er såret."
        );
        baFacade.create(samaritA2, samaritDTO);

        // Mutant
        BackgroundDTO mutant = new BackgroundDTO(
                "Mutant",
                "Upartisk Neutral",
                "Mutanter er et alment syn på Gaia og iblandt dem er “Brødet” den mest udbredte art. Disse store og muskuløse spektakler bliver ofte brugt som beskyttelse eller arbejdskraft af folk der ved hvordan man bedst bruger deres “unikke kvalifikationer.”",
                "https://cdn.discordapp.com/attachments/910894864265269318/966585698985607200/Mutant.png"
        );
        BackgroundDTO mutantDTO = bFacade.create(mutant);
        BackgroundAbilityDTO mutantA1 = new BackgroundAbilityDTO(
                "En ordentlig Lap",
                "Mutanten kan ikke, med mindre specificeret, bruge rustning eller et-hånds våben. Derimod, tæller et alment to-hånds våben som et et-hånds våben for Mutanter. (Specificeres)"
        );
        baFacade.create(mutantA1, mutantDTO);

        // Tekker
        BackgroundDTO tekker = new BackgroundDTO(
                "Tekker",
                "Impulsiv Neutral",
                "En Tekker lever og dør for teknologien de søger. Disse personer er tit tidligere prospektere der har indset at værdien ikke ligger i de almene materialer, men i de mange stadig fungerende stykker teknologi der kan samles og sælges for stor profit. Mange er på grund af deres mange interaktioner med Søgerne og andre technofile grupper selv blevet næsten religiøse.",
                "https://cdn.discordapp.com/attachments/910894864265269318/966586008323915816/Tekker.png"
        );
        BackgroundDTO tekkerDTO = bFacade.create(tekker);
        BackgroundAbilityDTO tekkerA1 = new BackgroundAbilityDTO(
                "Maskinen forblive",
                "Tekkere kan uden brug af terninger, altid identificere kompliceret teknologi. Ydermere kan de aldrig Katastrofalt fejle nogle evne-check med Videnskab."
        );
        baFacade.create(tekkerA1, tekkerDTO);
        BackgroundAbilityDTO tekkerA2 = new BackgroundAbilityDTO(
                "Du ved intet",
                "Tekkere vil altid have +10 i Handel under salg eller indkøb af Arkeo-Tek eller andet form for teknologi (Specificeres)."
        );
        baFacade.create(tekkerA2, tekkerDTO);

        // Krybskytte
        BackgroundDTO krybskytte = new BackgroundDTO(
                "Krybskytte",
                "Neutral Afvigende",
                "Siden tidernes morgen har mennesket jaget, dette ændrede sig ikke da vi drog ud mellem stjernerne. Krybskytten har brugt sit liv i vildmarken, både som jæger og som bytte.",
                "https://cdn.discordapp.com/attachments/910894864265269318/966586141535002634/Krybsskytte.jpg.png"
        );
        BackgroundDTO krybskytteDTO = bFacade.create(krybskytte);
        BackgroundAbilityDTO krybskytteA1 = new BackgroundAbilityDTO(
                "Sikke et eksemplar",
                "Krybskytten kan altid identificere en Dyrisk fjendes (også Bossers) svagheder. Ydermere kan de oftest skaffe sjældne ressourcer hvis de dressere dyr."
        );
        baFacade.create(krybskytteA1, krybskytteDTO);
        BackgroundAbilityDTO krybskytteA2 = new BackgroundAbilityDTO(
                "Ekspert",
                "I kamp mod ‘Dyriske’ fjender har Krybskytten det højeste initiativ under hele kampen."
        );
        baFacade.create(krybskytteA2, krybskytteDTO);

        // Landevejsrøver
        BackgroundDTO landevejsrover = new BackgroundDTO(
                "Landevejsrøver",
                "Impulsiv Afvigende",
                "Sønderlandet og hele Gaia er plaget af gemene banditter der ligger på lur langs befærdede veje. De berøver folk for alt hvad de er værd og nogen gange ender det med at offeret også må bøde med livet. Nogle af disse lovløse lever således af nødvendighed, mens andre ser det som naturens love.",
                "https://cdn.discordapp.com/attachments/910894864265269318/966586267141816361/Landvejsrver.png"
        );
        BackgroundDTO landevejsroverDTO = bFacade.create(landevejsrover);
        BackgroundAbilityDTO landevejsroverA1 = new BackgroundAbilityDTO(
                "Baghold",
                "Hvis Landevejsrøveren angriber en fjende der ikke kan se ham, slår han med Fordel."
        );
        baFacade.create(landevejsroverA1, landevejsroverDTO);
        BackgroundAbilityDTO landevejsroverA2 = new BackgroundAbilityDTO(
                "Jeg er realist!",
                "Hvis Landevejsrøveren kommer under 50% Liv får de +1 Bevægelses handling, så længe det er VÆK fra fjenden."
        );
        baFacade.create(landevejsroverA2, landevejsroverDTO);

        // Vandrer
        BackgroundDTO vandrer = new BackgroundDTO(
                "Vandrer",
                "Upartisk Neutral",
                "Utallige Vandrere søger et bedre liv når deres gamle er gået dem til halsen, eller er blevet dem berøvet. Disse retningsløse sjæle søger altid over den næste horisont hvor græsset forhåbentligt er grønnere og vandet… mindre grønt.",
                "https://cdn.discordapp.com/attachments/910894864265269318/966586387182788678/Vandrer.png"
        );
        BackgroundDTO vandrerDTO = bFacade.create(vandrer);
        BackgroundAbilityDTO vandrerA1 = new BackgroundAbilityDTO(
                "Pilgrimmens Ånd",
                "Så længe Vandreren er udendørs, har de altid 10 Perception."
        );
        baFacade.create(vandrerA1, vandrerDTO);
        BackgroundAbilityDTO vandrerA2 = new BackgroundAbilityDTO(
                "Under den åbne himmel",
                "Vandreren kan hjælpe sit hold med et Pusterum, selv hvis de ikke har slået lejr. Dog healer holdet kun 1 Livs Point under denne form for Pusterum."
        );
        baFacade.create(vandrerA2, vandrerDTO);

        // Beskytter
        BackgroundDTO beskytter = new BackgroundDTO(
                "Beskytter",
                "Impulsiv Ideolog",
                "Bestyktteren er en lavløs monster-jæger. Disse fromme og fanatiske sjæle opsøger ofte Mutanter eller de Udødelige med intentioner om at udslette disse vanskabninger for andres sikkerhed. Disse ildsjæle er oftest lav løse på grund af deres “ekstreme” synspunkter.",
                "https://cdn.discordapp.com/attachments/910894864265269318/966586496788365322/Beskytter.png"
        );
        BackgroundDTO beskytterDTO = bFacade.create(beskytter);
        BackgroundAbilityDTO beskytterA1 = new BackgroundAbilityDTO(
                "Gudløse Spektakler",
                "Beskytteren har altid +5 Udholdenhed i kamp mod “Udødelige” “Stakkel” og “Trolde” fjender."
        );
        baFacade.create(beskytterA1, beskytterDTO);
        BackgroundAbilityDTO beskytterA2 = new BackgroundAbilityDTO(
                "Vores sag er Hellig!",
                "I kamp mod ovennævnte fjende-typer har Beskytteren altid det højeste initiativ hele kampen."
        );
        baFacade.create(beskytterA2, beskytterDTO);

        // Prospektor
        BackgroundDTO prospektor = new BackgroundDTO(
                "Prospektor",
                "Upartisk Neutral",
                "For en prospektor kan selv et glasskår have værdig. Disse opportunistiske handelsmænd rumstere rundt i Gaias utallige ruiner i søgen efter revl og krat, alt hvad der ikke er boltet til gulvet kan sælges og alt hvad der kan sælges; skal sælges.",
                "https://cdn.discordapp.com/attachments/910894864265269318/966586659871289344/Prospektor.png"
        );
        BackgroundDTO prospektorDTO = bFacade.create(prospektor);
        BackgroundAbilityDTO prospektorA1 = new BackgroundAbilityDTO(
                "Jeg har en fantastisk pris til dig",
                "Prospektoren kan bruge Smir sammen med Handel når de køber eller sælger."
        );
        baFacade.create(prospektorA1, prospektorDTO);
        BackgroundAbilityDTO prospektorA2 = new BackgroundAbilityDTO(
                "Alting har sin værdi",
                "En NPC kan aldrig snyde en Prospektor under handel (Specificeres)."
        );
        baFacade.create(prospektorA2, prospektorDTO);

        // Slyngel
        BackgroundDTO slyngel = new BackgroundDTO(
                "Slyngel",
                "Impulsive Afvigende",
                "Gaia er høg over høg, hvis man ikke passer på sig selv, vil ingen andre gøre det for dig. Slyngen har indset dette faktum og bruger andres godhed til sin fordel. Dog er de langt fra troværdige i aspekt og rygter rejser med vinden.",
                "https://cdn.discordapp.com/attachments/910894864265269318/966586766851178526/Slyngel.png"
        );
        BackgroundDTO slyngelDTO = bFacade.create(slyngel);
        BackgroundAbilityDTO slyngelA1 = new BackgroundAbilityDTO(
                "Overvejelse, kost det hvad det vil",
                "Under kamp har Slyngelen mulighed for en gratis handling på sin egen tur, men må ikke bruge handlinger på at hjælpe sit hold hvis denne evne bliver brugt."
        );
        baFacade.create(slyngelA1, slyngelDTO);
        BackgroundAbilityDTO slyngelA2 = new BackgroundAbilityDTO(
                "Jeg arbejder bedst alene",
                "Hvis Slynglen er minimum 3 bevægelser fra sit hold under kamp, har de Udholdenhed +3"
        );
        baFacade.create(slyngelA2, slyngelDTO);

        // Pioneren
        BackgroundDTO pioneren = new BackgroundDTO(
                "Pioneren",
                "Upartisk Neutral",
                "Ethvert samfund er skabt af dem der tager de første skridt. Pioneren er en de brave sjæle der baner vejen for civilisationen på Gaia, trods planetens ønske om at sætte en stopper for menneskets fremmarch.",
                "https://cdn.discordapp.com/attachments/910894864265269318/966586852511453194/Pioneren.png"
        );
        BackgroundDTO pionerenDTO = bFacade.create(pioneren);
        BackgroundAbilityDTO pionerenA1 = new BackgroundAbilityDTO(
                "Godt håndværk er gudeligt",
                "Pioneren slår altid med Fordel med et våben han enten har selv har modificeret eller lavet."
        );
        baFacade.create(pionerenA1, pionerenDTO);
        BackgroundAbilityDTO pionerenA2 = new BackgroundAbilityDTO(
                "Det hele handler om knofedt",
                "Pioneren kan aldrig katastrofalt fejle hverken Reparation eller Håndværks check."
        );
        baFacade.create(pionerenA2, pionerenDTO);

        // Charlatan
        BackgroundDTO charlatan = new BackgroundDTO(
                "Charlatan",
                "Impulsiv Neutral",
                "Charlatanen har brugt sine sociale evner til at overleve der hvor andre havde brugt deres nævner. En tunge af sølv og et hjerte af kul kan føre mange frem i livet; i det lange løb handler det om at overleve… kost det hvad det vil.",
                "https://cdn.discordapp.com/attachments/910894864265269318/966586940231147540/Charlatan.png"
        );
        BackgroundDTO charlatanDTO = bFacade.create(charlatan);
        BackgroundAbilityDTO charlatanA1 = new BackgroundAbilityDTO(
                "Lad mig omformulere",
                "Charlatanen kan altid slå om hvis han fejler et Social tjek, med mindre det ender Katastrofalt."
        );
        baFacade.create(charlatanA1, charlatanDTO);
        BackgroundAbilityDTO charlatanA2 = new BackgroundAbilityDTO(
                "Altid hav en plan B",
                "Hvis Charlatanen starter kamp med en allieret mellem sig og fjenden, starter han altid med kampens højeste initiativ. Denne fordel forsvinder dog efter første runde."
        );
        baFacade.create(charlatanA2, charlatanDTO);
    }
}
