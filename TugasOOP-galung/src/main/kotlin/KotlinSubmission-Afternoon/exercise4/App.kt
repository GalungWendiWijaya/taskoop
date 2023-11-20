package id.infinitelearning.KotlinSubmission.exercise4




    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    fun main() {
        val userInput = "10"
        try {
            val number = userInput.toInt()
            println("Masukan data yang valid: $number")
        } catch (e: NumberFormatException) {
            println("Data yang Anda masukan tidak valid, harap masukkan angka yang benar")
        }
    }