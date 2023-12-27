import kotlinx.browser.document
import kotlinx.browser.window
<<<<<<< HEAD
import kotlinx.dom.appendElement
import kotlinx.dom.appendText
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.url.URL
import org.w3c.files.Blob
import org.w3c.files.BlobPropertyBag
import org.w3c.files.File
import org.w3c.xhr.XMLHttpRequest
import org.w3c.files.FileReader
=======

import kotlinx.dom.appendElement
import kotlinx.dom.appendText
import org.w3c.dom.Element
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.HTMLButtonElement

>>>>>>> fbae9a216f843defd84a2f37127b4971b3a19b34


fun main() {
    document.body?.appendElement("div") {

<<<<<<< HEAD
        val reader: FileReader

        val loadButton = document.createElement("button") as HTMLButtonElement
        loadButton.type = "button"
        loadButton.textContent = "Load Text File"

        val saveButton = document.createElement("button") as HTMLButtonElement
        saveButton.type = "button"
        saveButton.textContent = "Save Text File"

        var fileContent: String? = null

        loadButton.addEventListener("click") {

            val xhr = XMLHttpRequest()


            xhr.open("GET", "text-files/test.txt", true)


            xhr.onload = { _ ->
                if (xhr.status.toInt() == 200) {

                    fileContent = xhr.responseText
                    appendText(fileContent!!)

                    window.alert("Text file loaded successfully!")
                } else {
                    window.alert("Error loading the text file. Status: ${xhr.status}")
                }
            }

            xhr.onerror = {
                window.alert("Network error while loading the text file.")
            }

            xhr.send()
        }


        saveButton.addEventListener("click") {

            if (fileContent != null) {



                val dataURI = "data:text/plain;charset=utf-8,$fileContent"

                val link = document.createElement("a") as HTMLAnchorElement
                link.href = dataURI
                link.download = "yourCode.txt"

                document.body?.appendChild(link)
                link.click()

                document.body?.removeChild(link)

                window.alert("Text file saved successfully!")
            } else {
                window.alert("No content to save. Please load a text file first.")
            }
        }


        append(loadButton)
        append(saveButton)
    }
}

=======

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



>>>>>>> fbae9a216f843defd84a2f37127b4971b3a19b34

