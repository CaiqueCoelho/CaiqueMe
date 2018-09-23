package caique.me.caiqueme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_desc_job.*
import kotlinx.android.synthetic.main.activity_desc_project.*

class DescJobActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_desc_job)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val bundle=intent.extras
        var origin = 1
        if(bundle!=null)
        {
            origin = bundle.getString("origin").toInt()
        }

        if(origin == AIESEC_DIRECTOR) {

            val aiesecTime = "junho de 2013 - janeiro de 2017"
            val aiesecTitle = "Diretor de Gestão de Talentos"
            val aiesec = "AIESEC Campo Grande: Voluntariado" +
                    "\n\n- Organizar o processo seletivo para membros novos, bem como ações de head hunting, para suprir os déficits de RH do CL, caso necessário.\n" +
                    "- Selecionar e gerir o time responsável pela organização do processo seletivo para novos membros da AIESEC em Campo Grande\n" +
                    "- Implementar o modelo de seleção por competência e treinar os avaliadores do processo seletivo\n" +
                    "- Implementar a indução organizacional para todos os membros novos, incluindo processos como mentoring e eventos, bem como garantir a implementação do induction funcional.\n" +
                    "- Organizar e realizar a alumni induction\n" +
                    "- Gerir as turmas de alumni\n" +
                    "- Análise de BI (Business Intelligence), garantindo fast responding e qualidade na abordagem aos incritos para o Jovens Talentos.\n" +
                    "- Acompanhar as áreas de Finanças e Comunicação, garantindo a implementação correta dos Team Minimums.\n" +
                    "- Implementar políticas de Rewards & Recognition.\n" +
                    "- Realizar o controle da aplicação dos mínimos de membresia no comitê local (presenças em reuniões, eventos oficiais e conferências locais)\n" +
                    "- Reportar semanalmente ao presidente a situação do RH do comitê local (% retenção, saídas) e aplicação dos mínimos de membresia.\n" +
                    "- Gestão do CRM local e nacional\n" +
                    "- Auditoria dos termos de membresia"

            desc_title_job.text = aiesecTitle
            desc_time.text = aiesecTime
            desc_desc.text = aiesec
        }

        if(origin == UFMS) {
            val ufmsTime = "julho de 2016 - junho de 2017"
            val ufmsTitle = "Estágio: Técnico em Informática"
            val ufms = "- Atender e prestar manutenção em toda rede de computadores e hardwares da universidade\n"

            desc_title_job.text = ufmsTitle
            desc_time.text = ufmsTime
            desc_desc.text = ufms
        }


        if(origin == JERA_QA) {
            val jeraQaTime = "julho de 2017 - dezembro de 2017"
            val jeraQaTitle = "Estágio: Analista de Requisitos e Qualidade"
            val jeraQa = "- Identificar os Itens de teste-alvo a serem avaliados pelo esforço de teste\n" +
                    "- Definir os testes apropriados necessários e quaisquer dados de teste associados\n" +
                    "- Coletar e gerenciar os dados de teste\n" +
                    "- Avaliar o resultado de cada ciclo de teste\n" +
                    "- Auxiliar no relacionamento e suporte com o cliente\n" +
                    "- Conduzir testes manuais de interface\n" +
                    "- Conduzir testes automatizados de interface"

            desc_title_job.text = jeraQaTitle
            desc_time.text = jeraQaTime
            desc_desc.text = jeraQa
        }

        if(origin == JERA_CX) {
            val jeraCxTime = "janeiro de 2018 - junho de 2018"
            val jeraCxTitle = "Estágio: Manager Customer Experience"
            val jeraCx = "- Definir requisitos e regras de negócio de cada projeto juntamente dos clientes\n" +
                    "- Planejar e conduzir projetos com metodologias como Lean Inception, Direto ao Ponto e MVP Canvas\n" +
                    "- Auxiliar os clientes na definição do escopo do projeto\n" +
                    "- Gerenciar projetos com metodologias SCRUM, Kanban e XP\n" +
                    "- Identificar os Itens de teste-alvo a serem avaliados pelo esforço de teste\n" +
                    "- Avaliar o resultado de cada ciclo de sprint\n" +
                    "- Auxiliar no relacionamento e suporte com o cliente"

            desc_title_job.text = jeraCxTitle
            desc_time.text = jeraCxTime
            desc_desc.text = jeraCx
        }

        if(origin == JERA_ANDROID) {
            val jeraAndroidTime = "julho de 2018 - até o momento"
            val jeraAndroidTitle = "Desenvolvedor Android"
            val jeraAndroid = "- Construir aplicações Android nativas\n" +
                    "- Refatorar e manter aplicações Android em produção\n" +
                    "- Construir e manter aplicações em Java e Kotlin \n" +
                    "- Construir aplicações em arquiteturas MVP e MVVM\n" +
                    "- Construir aplicações modulares com Dagger"

            desc_title_job.text = jeraAndroidTitle
            desc_time.text = jeraAndroidTime
            desc_desc.text = jeraAndroid
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    companion object {
        private const val AIESEC_DIRECTOR = 1
        private const val UFMS = 2
        private const val JERA_QA = 3
        private const val JERA_CX = 4
        private const val JERA_ANDROID = 5
    }
}
