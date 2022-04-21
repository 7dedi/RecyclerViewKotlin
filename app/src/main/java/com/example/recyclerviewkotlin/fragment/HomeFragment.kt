package com.example.recyclerviewkotlin.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlin.*

class HomeFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    companion object{
        val INTENT_PARCELABLE = "EXTRA_ITEM"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val clubbolaList = listOf<Clubbola>(
            Clubbola(
                R.drawable.arsenal,
                "Arsenal",
                "Anda tidak pernah tahu apa yang akan Anda dapatkan dengan Arsenal dari satu minggu ke minggu berikutnya. Pasukan Mikel Arteta dalam tiga pertandingan tanpa kemenangan di Liga Premier sebelum mengalahkan Leeds United 4-2 pada hari Minggu. Penuh ketidakpastian."
            ),
            Clubbola(
                R.drawable.barca,
                "Barcelona",
                "Penampilan Barcelona baru-baru ini sangat bagus dan Lionel Messi meskipun ada spekulasi kuat bahwa tahun ini akan menjadi musim terakhirnya di Camp Nou, masih tetap di jalur sebagaimana para megabintang bersaksi. Klub Catalan itu tengah melakukan persiapan yang serius untuk pertandingan Liga Champions melawan PSG, dengan modal terakhir kemenangan telak 5-1 atas Deportivo Alaves pada hari Sabtu, akankah Barcelona kembali bertaring di pentas Eropa?"
            ),
            Clubbola(
                R.drawable.bm,
                "Bayern Munich",
                "Bayern mungkin juara dunia tetapi mereka hanya tim terbaik ketiga di planet saat ini di mata FiveThirtyEight. Apa lagi yang perlu mereka lakukan untuk menjadi yang teratas?"
            ),
            Clubbola(
                R.drawable.chelsea,
                "Chelsea",
                "Thomas Tuchel menikmati awal kehidupan yang menggembirakan sebagai bos Chelsea, memenangkan empat dari lima pertandingan pertamanya sebagai pelatih setelah menggantikan Frank Lampard bulan lalu. The Blues perlahan merayap kembali ke papan atas klasemen Liga Inggris."
            ),
            Clubbola(
                R.drawable.intermilan,
                "Inter Milan",
                "Inter berada di puncak Serie A saat ini, satu poin di atas rival AC Milan. Mereka akan saling berhadapan lagi pada akhir pekan depan."
            ),
            Clubbola(
                R.drawable.juventus,
                "Juventus",
                "Juventus telah memenangi sembilan gelar Serie A terakhir tetapi mereka punya pekerjaan rumah besar jika musim ini ingin menggenapkan capaian itu. Sementara ini, Juventus masih bercokol di urutan keempat tangga Serie A, di level Eropa mereka akan menghadapi FC Porto di Liga Champions pada hari Rabu mendatang."
            ),
            Clubbola(
                R.drawable.liverpool,
                "Liver Pool",
                "Terlepas dari performa buruk mereka belakangan ini, Liverpool masih menjadi tim terbaik keempat dunia, sekali lagi menurut FiveThirtyEight. Beberapa penggemar khawatir Klopp yang berada di bawah tekanan mungkin tiba-tiba pergi setelah tiga kekalahan beruntun melawan Brighton, Man City, dan Leicester.\n" +
                        "\n"
            ),
            Clubbola(
                R.drawable.manchestercity,
                "Manchester City",
                "Inilah dia tim terbaik dunia saat ini, menurut FiveThirtyEight : Manchester City. Tim asuhan Guardiola itu kini telah memenangkan 16 pertandingan yang luar biasa berturut-turut menyusul kemenangan 3-0 mereka atas Tottenham pada akhir pekan lalu. Gelar Liga Premier tampaknya sedang menuju ke Stadion Etihad."
            ),
            Clubbola(
                R.drawable.manchesterunited,
                "Manchester United",
                "Penampilan Manchester United telah menurun dalam beberapa pekan terakhir tetapi mereka tetap berada di urutan kedua di tabel Liga Premier. Selain bersaing dan berusaha mengejar ketertinggalan point dari City, pasukan Ole Gunnar Solskjaer juga akan berusaha lebih keras dan jauh di Liga Europa."
            ),
            Clubbola(
                R.drawable.paris,
                " Paris Saint-Germain",
                "Paris Saint-Germain berada di luar 10 besar daftar klub terbaik menurut versi FiveThirtyEight saat ini, tetapi itu bisa berubah jika mereka mengalahkan Barcelona di Camp Nou pada hari Selasa. Pasukan Mauricio Pochettino saat ini berada di urutan kedua di Ligue 1, satu poin di belakang Lille."
            ),
            Clubbola(
                R.drawable.realmadrid,
                "Real Madrid",
                "Real Madrid telah pulih dari kekalahan 2-1 bulan lalu melawan Levante dengan memenangkan tiga pertandingan secara bergantian. Tapi kekalahan di Liga Champions dari Atalanta mungkin berarti akhir bagi Zinedine Zidane di Bernabeu."
            )
        )

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_club)
        recyclerView.layoutManager = LinearLayoutManager(this.activity)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ClubbolaAdapter(this.requireContext(), clubbolaList){
            val intent = Intent(this.activity, DetailClubbolaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}