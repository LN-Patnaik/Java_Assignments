package streamsassnPackage;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Fruit> fruits=Arrays.asList(new Fruit("Mango",60,20,"yellow"),
				new Fruit("Apple",10,50,"red"),
				new Fruit("banana",16,10,"green"));
		System.out.println("Calories less than 100 are:");
		fruits.stream().filter(t->t.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories).reversed())
		.forEach(t->System.out.println(t.getCalories())); //q1.descending
System.out.println("-------------------------------------------------------");
System.out.println("Name of the fruits according sorted color wise:");
		fruits.stream().sorted(Comparator.comparing(Fruit::getColor)).forEach(t->System.out.println(t.getName()));; //q2
System.out.println("-------------------------------------------------------");		
System.out.println("Red color fruits are:");
		fruits.stream().filter(t->t.getColor()=="red").sorted(Comparator.comparing(Fruit::getPrice))
		.forEach(t->System.out.println(t.getName()));//q3
System.out.println("-------------------------------------------------------");
		

		List<News> news=Arrays.asList(new News(01,"hello friends","good morning","welcome"),
				new News(56,"superb","good evening","hey this is ram, i m planning a budget pan for the next trip"),
				new News(32,"awesome","good night","cool this is a good budget plan"));
		System.out.println("Id with maximum Commments:");
	news.stream().max(Comparator.comparing(News::getComment)).map(News::getNewsId).ifPresent(System.out::println);//q4
	System.out.println("Total number of times the word budget present are:");
	int count=(int)news.stream().filter(t->t.getCommentByUser().contains("budget")).count();
	System.out.println(count);//q5
	System.out.println("-------------------------------------------------------");
	System.out.println("Max comments by user are:");		
	Optional<String> max= news.stream().map(News::getCommentByUser).max((i,j)->i.compareTo(j));
	System.out.println(max.get());//q6
	System.out.println("-------------------------------------------------------");
	System.out.println("no.of comments by user are:");
	news.stream().max(Comparator.comparing(News::getCommentByUser)).map(News::getCommentByUser).ifPresent(System.out::println);//q7
	System.out.println("-------------------------------------------------------");
	List<Trader> trader=Arrays.asList(new Trader("raghav","Delhi"),
			new Trader("lucky","bangalore"),
			new Trader("mohit","pune"),
			new Trader("suresh","pune"),
			new Trader("rahul","indore"));
	List<Transaction> trans=Arrays.asList(new Transaction(new Trader("raghav","Delhi"),2014,6000),
			new Transaction(new Trader("lucky","bangalore"),2011,5700),
			new Transaction(new Trader("mohit","pune"),2018,9700),
			new Transaction(new Trader("suresh","pune"),2020,7000),
			new Transaction(new Trader("rahul","indore"),2000,17000));
	System.out.println("transaction in 2011 are(sorted):");
	trans.stream().sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);//q8
	System.out.println("-------------------------------------------------------");
	System.out.println("traders from city pune:");//q10
	trader.stream().filter(t->t.getCity().contains("pune")).sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);
	
System.out.println("-------------------------------------------------------");
	
	List<Trader> traders=trader.stream().distinct().collect(Collectors.toList());
	// System.out.println(traders);
	traders.forEach(System.out::println);// q9
System.out.println("-------------------------------------------------------");
System.out.println("Name of traders sorted in alphabetical order:");
 		trader.stream().sorted(Comparator.comparing(Trader::getName))
 		.forEach(t->System.out.println(t.getName()));//q11
 		
 		
System.out.println("-------------------------------------------------------");
System.out.println("Any traders based in indore:");//q12
/*
 * List<Trader> rd
 * =trader.stream().filter(t->t.getCity().equalsIgnoreCase("indore"))
 * .collect(Collectors.toList()); rd.forEach(System.out::println);
 */
boolean match= trader.stream().anyMatch(t->t.getCity().contains("indore"));
System.out.println(match);
System.out.println("-------------------------------------------------------");
System.out.println("transaction values from trader city delhi are:");
trans.stream().filter(t->t.getTrader().getCity().contains("delhi")).map(Transaction::getValue).forEach(System.out::println);//q13
System.out.println("-------------------------------------------------------");
System.out.println("The highest value of all transaction:");
trans.stream().sorted(Comparator.comparing(Transaction::getValue).reversed()).limit(1).map(Transaction::getValue).forEach(System.out::println);//q14
System.out.println("-------------------------------------------------------");
System.out.println("The smallest value of all transaction:");
trans.stream().sorted(Comparator.comparing(Transaction::getValue)).limit(1).map(Transaction::getValue).forEach(System.out::println);
	}
	

}
