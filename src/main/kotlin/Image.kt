class Image {

    // Private Variables
    private var name: String? = null
    private var date: String? = null
    private var url: String? = null

    fun add_info(user_name: String?, user_date: String?, user_url: String?) {
        /*
         Information is added to the Image instance.
         */
        name = user_name
        date = user_date
        url = user_url

    }

    fun display_info() {
        // The info in the class is displayed.
        println("$name $date $url")
    }
    fun get_name(): String? {
        // The name is returned.
        return name
    }
    fun get_date(): String? {
        // The date is returned.
        return date
    }
    fun get_url(): String? {
        // The URL is returned.
        return url
    }
}