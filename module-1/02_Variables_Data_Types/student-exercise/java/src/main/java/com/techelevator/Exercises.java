package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int originalNumRaccoons = 3;
		int raccoonsLeaving = 2;
		int raccoonsLeft = originalNumRaccoons - raccoonsLeaving;
		System.out.println(raccoonsLeft);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numFlowers = 5;
		int numFlyingBees = 3;
		int flowersMinusBees = numFlowers - numFlyingBees;
		System.out.println(flowersMinusBees);
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int startingNumPigeon = 1;
		int addedPigeon = 1;
		int totalPigeon = startingNumPigeon + addedPigeon;
		System.out.println(totalPigeon);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int originalNumOwls = 3;
		int addedOwls = 2;
		int totalOwls = originalNumOwls + addedOwls;
		System.out.println(totalOwls);
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int startingBeavers = 2;
		int beaversLeaving = 1;
		int beaversLeft = startingBeavers - beaversLeaving;
		System.out.println(beaversLeft);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int originalToucans = 2;
		int addedToucans = 1;
		int totalToucans = originalToucans + addedToucans;
		System.out.println(totalToucans);
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		int squirrelsMinusNuts = squirrels - nuts;
		System.out.println(squirrelsMinusNuts);
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarter = .25D;
		double dime = .10D;
		double nickel = .05D;
		int quartersFound = 1;
		int dimesFound = 1;
		int nickelsFound = 2;
		double quartersTotal = quarter * quartersFound;
		double dimesTotal = dime * dimesFound;
		double nickelsTotal = nickel * nickelsFound;
		double totalMoneyFound = nickelsTotal + dimesTotal + quartersTotal;
		System.out.println(totalMoneyFound);
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brierClassMuffins = 18;
		int macadamsClassMuffin = 20;
		int flanneryClassMuffin = 17;
		int totalMuffins = brierClassMuffins + macadamsClassMuffin + flanneryClassMuffin;
		System.out.println(totalMuffins);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyoPrice = .14D;
		double whistlePrice = .24D;
		double totalPrice = .14D + .24D;
		System.out.println(totalPrice);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int lrgMarshmellow = 8;
		int smlMarshmellow = 10;
		int totalMarshmellow = smlMarshmellow + lrgMarshmellow;
		System.out.println(totalMarshmellow);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int schoolSnow = 17;
		int houseSnow = 29;
		int houseMinusSchoolSnow = houseSnow = schoolSnow;
		System.out.println(houseMinusSchoolSnow);
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int originalMoney = 10;
		int truckPrice = 3;
		int pencilPrice = 2;
		int moneyLeft = (originalMoney - pencilPrice) - truckPrice;
		System.out.println(moneyLeft);
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int originalMarbles = 16;
		int lostMarbles = 7;
		int marblesLeft = originalMarbles - lostMarbles;
		System.out.println(marblesLeft);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int shellGoal = 25;
		int shellCurrent = 19;
		int shellStillNeeded = shellGoal - shellCurrent;
		System.out.println(shellStillNeeded);
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int balloons = 17;
		int redBalloons = 8;
		int greenBalloons = balloons - redBalloons;
		System.out.println(greenBalloons);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int originalBooks = 38;
		int addedBooks = 10;
		int totalBooks = originalBooks + addedBooks;
		System.out.println(totalBooks);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int legsOnBee = 6;
		int numBees = 8;
		int totalLegs = numBees * legsOnBee;
		System.out.println(totalLegs);
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double conePrice = .99D;
		int numOfCones = 2;
		double totalConePrice = conePrice * numOfCones;
		System.out.println(totalConePrice);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksRequired = 125;
		int rocksPossesed = 64;
		int rocksNeeded = rocksRequired - rocksPossesed;
		System.out.println(rocksNeeded);
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int marblesBeforeLoss = 38;
		int marblesLost = 15;
		int marblesLeftOver = marblesBeforeLoss - marblesLost;
		System.out.println(marblesLeftOver);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMiles = 78;
		int milesTraveled = 32;
		int milesToGo = totalMiles - milesTraveled;
		System.out.println(milesToGo);
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		int saturdayMornMinutes = 90;
		int saturdayEveMinutes = 45;
		int totalMinutesShoveling = saturdayEveMinutes + saturdayMornMinutes;
		System.out.println(totalMinutesShoveling);
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int hotdogs = 6;
		double hotdogPrice = .50D;
		double priceForHotdogs = hotdogPrice * hotdogs;
		System.out.println(priceForHotdogs);
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double hiltMoney = .50D;
		double pencilCost = .07D;
		double numPencilsCanBeBought = hiltMoney / pencilCost; //how can I round this to 7?
		System.out.println(numPencilsCanBeBought);
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int numOfButterflies = 33;
		int numOrangeButterflies = 20;
		int numRedButterflies = numOfButterflies - numOrangeButterflies;
		System.out.println(numRedButterflies);
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		int payment = 1;
		double purchasePrice = .54D;
		double changeDue = payment - purchasePrice;
		System.out.println(changeDue);
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int currentTrees = 13;
		int plannedTrees = 12;
		int totalTrees = currentTrees + plannedTrees;
		System.out.println(totalTrees);
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int hoursInDay = 24;
		int daysTilVisit = 2;
		int hoursTilVisit = daysTilVisit * hoursInDay;
		System.out.println(hoursTilVisit);
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numOfCousins = 4;
		int piecesPerCousin = 5;
		int gumNeeded = numOfCousins * piecesPerCousin;
		System.out.println(gumNeeded);
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		int danMoney = 3;
		int purchaseAmount = 1;
		int danRemainingMoney = danMoney - purchaseAmount;
		System.out.println(danRemainingMoney);
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int peoplePerBoat = 3;
		int peopleInBoats = boatsInLake * peoplePerBoat;
		System.out.println(peopleInBoats);
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int totalLegos = 380;
		int lostLegos = 57;
		int remainingLegos = totalLegos - lostLegos;
		System.out.println(remainingLegos);
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinGoal = 83;
		int muffinCurrent = 35;
		int muffinsNeeded = muffinGoal - muffinCurrent;
		System.out.println(muffinsNeeded);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayon = 1400;
		int lucyCrayon = 290;
		int crayonDifference = willyCrayon - lucyCrayon;
		System.out.println(crayonDifference);
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int pages = 22;
		int totalStickerCount = pages * stickersPerPage;
		System.out.println(totalStickerCount);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int cupcakes = 96;
		int children = 8;
		int cupcakesPerChild = cupcakes / children;
		System.out.println(cupcakesPerChild);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int gingerCookies = 47;
		int cookiesPerJar = 6;
		int cookiesNotJarred = gingerCookies % cookiesPerJar;
		System.out.println(cookiesNotJarred);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int pasteries = 59;
		int neighbors = 8;
		int leftAfterSharing = pasteries % neighbors;
		System.out.println(leftAfterSharing);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesPerTray = 12;
		int cookiesGoal = 276;
		int numTraysNeeded = cookiesGoal / cookiesPerTray;
		System.out.println(numTraysNeeded);
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzels = 480;
		int serving = 12;
		int servingsMade = pretzels / serving;
		System.out.println(servingsMade);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCakes = 53;
		int leftHome = 2;
		int cakesPerBox = 3;
		int cakesGivenAway = (lemonCakes - leftHome) / cakesPerBox;
		System.out.println(cakesGivenAway);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticks = 74;
		int numPeopleSharing = 12;
		int carrotsLeft = carrotSticks % numPeopleSharing;
		System.out.println(carrotsLeft);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int bears = 98;
		int shelfCapacity = 7;
		int shelvesFilled = bears / shelfCapacity;
		System.out.println(shelvesFilled);
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int picsInAlbum = 20;
		int totalPics = 480;
		int albumsNeeded = totalPics / picsInAlbum;
		System.out.println(albumsNeeded);
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int cards = 94;
		int maxCardsPerBox = 8;
		int fullBoxes = cards / maxCardsPerBox;
		System.out.println(fullBoxes);
        int cardsInUnfilledBox = cards % maxCardsPerBox;
        System.out.println(cardsInUnfilledBox);
		/*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int booksToShelve = 210;
		int shelves = 10;
		int booksPerShelf = booksToShelve / shelves;
		System.out.println(booksPerShelf);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int croissants = 17;
		int guests = 7;
		int croissantPerGuest = croissants / guests;
		System.out.println(croissantPerGuest);
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
