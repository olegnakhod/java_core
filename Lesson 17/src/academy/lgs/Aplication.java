package academy.lgs;

public class Aplication {

	public static void main(String[] args) {

		Number[] arr = { 3, 13, 7, 9, 353, 5, 25, 23, 52, 352, 64567, 458, 2352, 634, 63, 46, 34, 674, 587, 465, 867,97,63,46,34,6,46,2,621,35,21,36,2,6332};
		
//		System.out.println("Exercice 1");
//		
//		Collection collectionFirst = new Collection(arr);
//		Collection.ReplacmentOfNull iteratorFirst = collectionFirst.createReplacmentOfNull();
//		while (iteratorFirst.hasNext()) {
//			System.out.println(iteratorFirst.next());
//		}
//		
//		System.out.println("Exercice 2");
//
//		Collection collectionSecond = new Collection(arr);
//		Collection.OutputThroughOne iteratorSecond = collectionSecond.createOutputThroughOne();
//		while (iteratorSecond.hasNext()) {
//			System.out.println(iteratorSecond.next());
//		}
		
		System.out.println("Exercice 3");
		
		Collection collectionThird = new Collection(arr);
		Iterator iteratorThird = collectionThird.thirdElement();
		while (iteratorThird.hasNext()) {
			iteratorThird.next();
		}
		
		System.out.println("Exercice 4");
		
		Collection collectionFourth = new Collection(arr);
		Iterator iteratorFourth = collectionFourth.createfifthElement();
		while (iteratorFourth.hasNext()) {
			iteratorFourth.next();
		}

		System.out.println("Exercice 5");

		Iterator iteratorFifth = Collection.createdPairedElement();
		while (iteratorFifth.hasNext()) {
			iteratorFifth.next();
		}
	}

}
