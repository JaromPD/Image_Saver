import Image as img

fun createImage(): img{
    /*
     This function gathers the info to create and instance of an image.
     createImage newImage
     */

    // The info is gathered
    print("What is the name?: ")
    val name = readLine()
    print("What is the date?: ")
    val date = readLine()
    print("What is the URL?: ")
    val url = readLine()

    // The image instance is created.
    val newImage = img()

    // The info is added to the image object.
    newImage.add_info(name, date, url)

    // The image object is returned
    return newImage
}

fun removeImage(images: MutableList<img>){
    /*
     This function removes a image from the image list by it's name.
     */

    // The image name is taken
    print("What is the name?: ")
    val removal_name = readLine()

    // The function looks through all the names to find the matching name.
    for (image in images) {
        if(image.get_name() == removal_name){
            // The image with the matching name's index is grabbed.
            val removalIndex = images.indexOf(image)
            // The image is removed
            images.removeAt(removalIndex)
        }
    }
}

fun main() {

    // The images list is created.
    val images = mutableListOf<img>()
    // Cont is started as true.
    var cont = true
    // The menu loop begins.
    while(cont){
        // The menu is displayed.
        println("What would you like to do?\n 1. Add a new image\n 2. Display images\n 3. Remove image\n 4. Display image by name\n 5. Quit")
        print("> ")
        // The menu descision is taken and directed to an action.
        when(Integer.valueOf(readLine())){
            1-> {
                // The newly created image instance is added to the images collection.
                images += createImage()
            }
            2 -> {
                // Every image in the collection is displayed.
                images.forEach{image ->
                    image.display_info()
                }
            }
            3 -> {
                // The removeImage function is called.
                removeImage(images)
            }
            4 -> {
                // The image name is taken.
                print("What is the name?: ")
                val display_name = readLine()
                // The name is matched with the correct image in the list.
                for (image in images) {
                    if(image.get_name() == display_name){
                        // That images info is displayed.
                        image.display_info()
                    }
                }

            }
            5 -> {
                cont = false
            }

        }
    }
}