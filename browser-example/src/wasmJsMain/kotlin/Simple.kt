import kotlinx.browser.document
import kotlinx.browser.window

import kotlinx.dom.appendElement
import kotlinx.dom.appendText
import org.w3c.dom.Element
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.HTMLButtonElement



fun main() {
    document.body?.appendElement("div") {


        val uploadButton = document.createElement("button") as HTMLButtonElement
        val downloadButton = document.createElement("button") as HTMLButtonElement
        uploadButton.type = "button"
        uploadButton.textContent = "Upload txt"

        downloadButton.type = "button"
        downloadButton.textContent = "Download txt"

        // Add a click event listener to the button
        uploadButton.addEventListener("click", {
            // Code to be executed when the button is clicked
            window.alert("File uploaded!")
        })

        downloadButton.addEventListener("click", {
            // Code to be executed when the button is clicked
            window.alert("File downloaded!")
        })

        append(uploadButton)
        append(downloadButton)


    }



}

val progress = "⡆⠇⠋⠙⠸⢰⣠⣄".map(Char::toString)




