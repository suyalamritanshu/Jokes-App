package com.example.jokes.Model

import androidx.lifecycle.ViewModel
import java.util.*
import kotlin.collections.ArrayList

class JokesViewmodel : ViewModel(){
    fun getRandomJokes(): String{
        val list=ArrayList<String>()

        list.add("A very drunk man comes out of the bar and sees another very drunk man.\n" +
                "He looks up in the sky and says, \"Is that the sun or the moon?\"\n" +
                "The other drunk man answers, \"I don't know. I'm a stranger here myself.\"")
        list.add("Two cows are standing in a field.\n" +
                "One says to the other \"Are you worried about Mad Cow Disease?\"\n" +
                "The other one says \"No, It doesn't worry me, I'm a horse!\"")
        list.add("A guy says to his friend, \"Guess how many coins I have in my pocket.\"\n" +
                "The friends says, \"If I guess right, will you give me one of them?\"\n" +
                "The first guys says, \"If you guess right, I'll give you both of them!\"");
        list.add("The First 3 Years of Marriage\n" +
                "In the first year of marriage, the man speaks and the woman listens.\n" +
                "In the second year, the woman speaks and the man listens.\n" +
                "In the third year, they both speak and the neighbors listen.");

        list.add("Love is one long sweet dream, and marriage is the alarm clock.")
        list.add("Q: Can a kangaroo jump higher than the Empire State Building?\n" +
                "A: Yes, because the Empire State Building can't jump!")
        list.add("Teacher: What are some products of the West Indies?\n" +
                "Student: I don’t know.\n" +
                "Teacher: Of course, you do. Where do you get sugar from?\n" +
                "Student: We borrow it from our neighbor..")

        list.add("Two student were chatting:\n" +
                "First: Do you know what is snake’s favorite subject?\n" +
                "second:, no, you tell.\n" +
                "first: Hisssstory!!!")

        list.add("Teacher: From where to where foreigner ruled us?\n" +
                "Student: I am not sure but I think from page 50 to 55…")

        list.add("Teacher : if you want to make your character good, then say all woman ‘Mother’.\n" +
                "Student: well that will make my character good, but what about my Father ??\n" +
                "Two cows are standing in a field.\n")

        list.add("Man: How can you tell if a man is happy?\n" +
                "Woman: Who cares?!")

        list.add("Teacher: “Who can tell me what 7 times 6 is?”\n" +
                "Student: “It is 42 mam!”\n" +
                "Teacher: “great, and who will tell me what 6 times 7 is?”\n" +
                "Same student: “It 24 mam.”")
        list.add("An E.N.T. Professor retired from college. In the farewell college faculty\n" +
                "gifted him a silver ear.\n" +
                "Thanking the faculty the professor said: “Thank god I am not a gynecologist.”")

        list.add("One says to the other “Are you worried about Mad Cow Disease?”\\n\" +\n" +
                "                \"The other one says “No, It doesn’t worry me, I’m a horse!”")
        Collections.shuffle(list)
        return list.get(0)
    }
}