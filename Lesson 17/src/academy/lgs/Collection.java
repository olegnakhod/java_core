package academy.lgs;

public class Collection {

	private static Number[] array;

	public Collection(Number[] array) {
		Collection.array = array;
	}

	public class ReplacmentOfNull implements Iterator {

		private int count = 0;

		@Override
		public boolean hasNext() {
			return count < array.length;
		}

		@Override
		public Number next() {
			if ((int) array[count] % 2 == 0) {
				return array[count++] = 0;
			} else {
				return array[count++];
			}

		}

	}

	public ReplacmentOfNull createReplacmentOfNull() {
		return new ReplacmentOfNull();
	}

	public class OutputThroughOne implements Iterator {
		int count = array.length - 1;

		@Override
		public boolean hasNext() {
			return count >= 0;
		}

		@Override
		public Number next() {
			if (count > 0) {
				count--;
			}
			return array[count--];
		}
	}

	public OutputThroughOne createOutputThroughOne() {
		return new OutputThroughOne();
	}

	public Iterator thirdElement() {

		return new Iterator() {

			int count = array.length - 1;
			public final int ITTERATION_STEP = 3;

			@Override
			public boolean hasNext() {
				return count >= ITTERATION_STEP;

			}

			@Override
			public Number next() {
				count = count - ITTERATION_STEP;
				if (count >= 0) {
					if (!((int) array[count] % 2 == 0)) {
						System.out.println(array[count] + ",");
					} else if (count < 0) {
						System.out.println("Лічильник вийшов за межі позитивних значеннь");
					}
				}
				return array[count];
			}
		};
	}

	public Iterator createfifthElement() {

		class FifthElement implements Iterator {

			int count = array.length - 1;
			public final int ITTERATION_STEP = 5;

			@Override
			public boolean hasNext() {
				return count > 0;
			}
			@Override
			public Number next() {
				count = count - ITTERATION_STEP;
				if(count >=  0) {
					if ((int) array[count] % 2 == 0) {
						System.out.println((int)array[count] - 100);
					}
				}else {
					System.out.println("Лічильник вийшов за межі позитивних значеннь");
					return array[0];
				}
				return array[count];
			}
		}
		return new FifthElement();
	}

	private static class PairedElement implements Iterator {
		
		int count = 0;
		public final int ITTERATION_STEP = 2;

		@Override
		public boolean hasNext() {
			return count < array.length;

		}

		@Override
		public Number next() {
			if(count < array.length - ITTERATION_STEP) {
				count = count + ITTERATION_STEP;
				if ((int) array[count] % 2 == 0) {
					int value = (int) array[count] + 1;
					System.out.println(value + ",");
				}
			}
			
			return array[count];
		}
	}
	
	public static Iterator createdPairedElement() {
		return new PairedElement();
	}

}
