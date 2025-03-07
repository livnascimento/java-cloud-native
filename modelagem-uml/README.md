# Modelagem do iPhone com UML

## Descrição

Este repositório contém a solução do desafio de modelagem UML para o componente iPhone, abordando suas funcionalidades principais como **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador de Internet**.

O desafio consiste em representar as funcionalidades descritas utilizando um diagrama UML, que será a base para a implementação das classes que simulam o comportamento dessas funcionalidades. 

## Diagrama UML

O diagrama UML a seguir descreve as classes que representam as funcionalidades do iPhone:

[![](https://mermaid.ink/img/pako:eNp9U8tu4zAM_BVBpy1a_4BRFAi2h10gCYq-DoUvrMTaBGTS0CNok-bfV06cxlk39cmaGYqjkbjRRizqUhdFUXGk6LBUiww5YCtKFN01wqiMtOppMVefak4rArWEYKhFjlLxrrRi4yCEW4LaQ1ux6r-huCg-b9Q9dl5siuIXKZABt9eMJbMOPLpGHtHhmzAZmWqWsMIarPi_HNEzxl5yIitVoR6iJ65V2x9EzrHAMgc2MBzje5GBDgxZsDjzLayRz8jnFOL1vuYmp8URooSfVZ2DD5eBiapPs4d2iU6D2wzpqksVxYD_dXEEOkjhFOk7wFAaxkTIKRsSPpAHbnvafnopm_Hmde42RMWpRT_SjXpBRLb4ja_fQ1JjhnIx9ZT3SPIs6zPOJk9BjZzhO72Sv4OaGA4Gk3cX_yv-ZBvis9uxA7C0T2YpK5i9wgkXEzhaw2Hvozd9pXMALZDN87SzUunYYIuVLvNvzqqJla54m4WQ7_Phg40uo094pb2kutHlG7iQV6mzObFhlr7QDvhF5LhGS_2j2M_vboy3_wCPUz3e?type=png)](https://mermaid.live/edit#pako:eNp9U8tu4zAM_BVBpy1a_4BRFAi2h10gCYq-DoUvrMTaBGTS0CNok-bfV06cxlk39cmaGYqjkbjRRizqUhdFUXGk6LBUiww5YCtKFN01wqiMtOppMVefak4rArWEYKhFjlLxrrRi4yCEW4LaQ1ux6r-huCg-b9Q9dl5siuIXKZABt9eMJbMOPLpGHtHhmzAZmWqWsMIarPi_HNEzxl5yIitVoR6iJ65V2x9EzrHAMgc2MBzje5GBDgxZsDjzLayRz8jnFOL1vuYmp8URooSfVZ2DD5eBiapPs4d2iU6D2wzpqksVxYD_dXEEOkjhFOk7wFAaxkTIKRsSPpAHbnvafnopm_Hmde42RMWpRT_SjXpBRLb4ja_fQ1JjhnIx9ZT3SPIs6zPOJk9BjZzhO72Sv4OaGA4Gk3cX_yv-ZBvis9uxA7C0T2YpK5i9wgkXEzhaw2Hvozd9pXMALZDN87SzUunYYIuVLvNvzqqJla54m4WQ7_Phg40uo094pb2kutHlG7iQV6mzObFhlr7QDvhF5LhGS_2j2M_vboy3_wCPUz3e)

## Considerações relevantes:

- O diagrama foi feito para ser desenvolvido em Java. Entretanto, o Java **não** suporta a herança múltipla. Logo, o comportamento representado acima precisaria ser alcançado através do uso de interfaces.

- Já que o comportamento de herança múltipla só pode ser simulado com interfaces, as entidades ReprodutorMusical, AparelhoTelefonico e NavegadorInternet possuem somente métodos. Em linguagens que suportam a herança múltipla, o iPhone poderia herdar *playlist* e *contatos* de suas respectivas classes base.

---

Obrigada por visitar meu repo! Te convido a entrar no meu perfil e dar uma olhada no que tô desenvolvendo no momento. 💜