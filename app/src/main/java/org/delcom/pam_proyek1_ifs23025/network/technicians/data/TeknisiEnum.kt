package org.delcom.pam_proyek1_ifs23025.network.technicians.data

enum class TeknisiEnum(val fullName: String, val shortName: String) {
    LISTRIK("Teknisi Listrik", "Kelistrikan"),
    HARDWARE("Teknisi Hardware", "Perangkat Keras"),
    AC("Teknisi AC", "Pendingin Ruangan"),
    MEKANIK("Teknisi Mekanik", "Mesin & Mekanik"),
    LAMPU("Teknisi Pro 7", "Pro 7"),
    ELEKTRONIK("Teknisi Elektronik", "Elektronik"),
    SOUND("Teknisi Sound", "Speaker, Mic, Sound System"),
    OVERHAUL("Teknisi Overhaul", "Turun Mesin"); //

    companion object {
        // Fungsi pembantu untuk mendapatkan list String untuk dropdown
        fun getAllFullNames(): List<String> {
            return entries.map { it.fullName }
        }
    }
}