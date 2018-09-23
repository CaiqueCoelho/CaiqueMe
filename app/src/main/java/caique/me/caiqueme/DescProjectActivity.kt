package caique.me.caiqueme

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_desc_project.*
import android.webkit.WebView
import android.webkit.WebViewClient



class DescProjectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_desc_project)

        val bundle=intent.extras
        var origin = 1
        if(bundle!=null)
        {
            origin = bundle.getString("origin").toInt()
        }

        var textTitle = ""
        var textDesc = ""
        var textLink = ""
        var textLinkGit = ""

        when(origin){

            ENEAGRAMA ->{
                textTitle = "Aplicativo Android: Teste Eneagrama"
                textDesc = "- Com mais de 70 mil downloads o Teste Eneagrama é um aplicativo que busca traçar o perfil do eneagrama dos usuários a partir de uma série de perguntas" +
                        "\n\n- O apliativo foi lançado no primeiro semestre de 2018 e foi idealizado e desenvolvido por mim" +
                        "\n\n - O aplicativo é completamente gratuito e surgiu como uma ideia de um MVP afim de levar o teste eneagrama ao maior número de usuários possíveis" +
                        "\n\n - Com o sucesso do App hoje trabalho em um plano de negócio com o objetivo de transformar o aplicativo em uma startup na área de gestão de pessoas"
                textLink = "https://play.google.com/store/apps/details?id=caiquecoelho.com.testeeneagrama"

                desc_title_project.text = textTitle
                desc_desc_project.text = textDesc

                project_see.setOnClickListener { clickButtonWebview(textLink) }
            }

            TCC ->{
                textTitle = "TCC na área de Inteligência Artificial"
                textDesc = "Agrupamento de dados como suporte à estimativa de esforço para desenvolvimento de software" +
                        "\n\nDurante a graduação a área de IA foi a área que despertou a minha paixão pelo curso e me inspira a ser quem eu sou e a sonhar por futuro melhor guiado pela tecnologia. Perante tal paixão o meu projeto de conclusão de curso não poderia ser em outra área" +
                        "\n\n - A motivação por trás desse projeto veio de uma dor real vivida por mim na empresa que trabalho. " +
                        "\n\nNa área de desenvolvimento de software ágil somos completamente dependentes de um bom planejamento do cronograma do projeto, " +
                        "planejamento o qual é feito com base em cima de uma métrica muito importante: as estimativas de dificuldades de esforço para " +
                        "se implementar um software. Em um cenário onde todas essas estimativas são documentadas o meu conhecimento em IA me " +
                        "proporcinou o insight de trabalhar com data mining em cima dos planejamentos de estimativa e cronogramas afim de encontrar " +
                        "padrões e informações relevantes através de uma abordagem de text mining com o uso de agrupamento em clusters com o " +
                        "algoritmo k-means para exploração e extração de informações relevantes que pudessem contribuir positivamente para planejamentos " +
                        "de projetos futuros"
                textLink = "abordagem de text mining com o uso de agrupamento em clusters com o algoritmo k-means para exploração e extração de informações relevantes"

                desc_title_project.text = textTitle
                desc_desc_project.text = textDesc

                project_see.setOnClickListener { clickButtonWebview(textLink) }
            }

            IA -> {
                textTitle = "Alguns certificados na área de IA e Python"
                textDesc = "Com a paixão pela área alguns certificados vieram ao longo da trajetória:" +
                        "\n\n - Elements of AI" +
                        "\n - Intro to Python for Data Science " +
                        "\n - Mineração de emoção em Textos com Python e NLTK" +
                        "\n - Top 5 Machine Learning Libraries in Python"
                project_see.visibility = View.GONE
                desc_title_project.text = textTitle
                desc_desc_project.text = textDesc
            }

            TEXTS -> {
                textTitle = "Alguns textos publicados"
                textDesc = "Todo conhecimento merece ser compartilhado e multiplicado. Um dos meus prazeres é levar conhecimento " +
                        "por meio de artigos e posts no LinkedIn ou no Medium." +
                        "\n\n Alguns dos meus textos publicados são: " +
                        "\n\n - Chutando os resultados do Oscar 2018 com inteligência artificial!" +
                        "\n - ICO Experty? O que é?" +
                        "\n - O que são ICOs? Vale a pena!?" +
                        "\n - Um oceano azul para encontrar os seus candidatos desta eleição!"
                textLink = "https://www.linkedin.com/in/caiquecoelho/detail/recent-activity/posts/"
                textLinkGit = "https://medium.com/@caiquedpfc"

                desc_title_project.text = textTitle
                desc_desc_project.text = textDesc

                project_see.text = "Ver artigos no LinkedIn"
                project_see_git.text = "Ver artigos no Medium"

                project_see.setOnClickListener { clickButtonWebview(textLink) }
                project_see_git.setOnClickListener { clickButtonWebview(textLinkGit) }
            }

            GASOLINA -> {
                textTitle = "Aplicativo android: Gasolina?"
                textDesc = "Sou uma pessoa muito mão na massa que adora aprender na prática. O aplicativo gasolina é um aplicativo muito simples que desenvolvi " +
                        "durante o início do meu aprendizado no desenvolvimento de aplicativos android. " +
                        "\n\nO app tem como objetivo informar principal informar se é melhor abastecer com álcool ou gasolina dependendo do valor de ambos"
                textLink = "https://play.google.com/store/apps/details?id=caiquecoelho.com.gasolina"
                textLinkGit = "https://github.com/CaiqueCoelho/Gasolina"

                desc_title_project.text = textTitle
                desc_desc_project.text = textDesc

                project_see.setOnClickListener { clickButtonWebview(textLink) }
                project_see_git.setOnClickListener { clickButtonWebview(textLinkGit) }
            }

            CAM -> {
                textTitle = "Aplicativo android: Gemidão Cam"
                textDesc = "Algumas pessoas podem achar vergonhoso contar com um aplicativo como esse no portfólio hahahaha, mas " +
                        "eu juro que existe uma ótima explicação." +
                        "\n\n Em 2017 no início do ano eu coloquei como um dos meus objetivos do ano publicar até o final daquele ano " +
                        "um aplicativo android na loja da Google, no dia 20 de dezembro resolvi conferir a lista para ver o que havia " +
                        "cumprido e me deparei com o objetivo de publicar um app android que ainda não estava cumprido. " +
                        "\n\nEntão comecei a pensar em inúmeras opções viáveis e que seria divertidas de fazer dentro dos 11 dias restantes " +
                        "do ano. \n\nDurante esse momento de reflexão ao abrir um vídeo no WhatsApp me deparei com o tão temido " +
                        "gemidão do WhatsApp e como um estalar de dedos me veio a ideia de criar um app muito similar a uma câmera, " +
                        "porém que teria como objetivo disparar o gemidão quando o usuário resolver tirar uma foto e capturar a reação " +
                        "do usuário no momento do disparo assustado com o gemidão hahaha. \n\nPode parecer ridículo, mas foi o meu primeiro " +
                        "app publicado na loja, o qual me trouxe muitos aprendizados, diversão e me ajudou a cumprir um item da minha lista" +
                        "de 2017!"
                textLink = "https://play.google.com/store/apps/details?id=cameradogemidao.caiquecoelho.com.cameradogemidao"
                textLinkGit = "https://github.com/CaiqueCoelho/Gemidao-Cam"

                desc_title_project.text = textTitle
                desc_desc_project.text = textDesc

                project_see.setOnClickListener { clickButtonWebview(textLink) }
                project_see_git.setOnClickListener { clickButtonWebview(textLinkGit) }
            }

        }
    }

    fun clickButtonWebview(url: String){
        val intent = Intent(this, WebviewActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }

    companion object {
        private const val ENEAGRAMA = 1
        private const val TCC = 2
        private const val IA = 3
        private const val TEXTS = 4
        private const val GASOLINA = 5
        private const val CAM = 6
    }
}
