public class Application
{
	public static void main(String[] args)
	{
		String input_file = "problem2.txt";
		String output_file = "unique_word_counts.txt";
		DuplicateCounter duplicateCounterObj = new DuplicateCounter();
		duplicateCounterObj.count(input_file);
		duplicateCounterObj.write(output_file);

	}
}