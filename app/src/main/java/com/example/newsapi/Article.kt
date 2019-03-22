package com.example.newsapi



//data class Articles(val totalResults: Int ,
//                    val articles: List<Myclass>,
//                    val status: String )
//
//data class  Myclass(val publishedAt: String ,
//                        val author: String ,
//                        val urlToImage: String ,
//                        val description: String ,
//                        val source: Source,
//                        val title: String ,
//                        val url: String ,
//                        val content: String)
//
//
//data class Source(val name: String ,
//                     val id: Int)
//

data class ArticlesItem(
    val publishedAt: String? = null,
    val author: String? = null,
    val urlToImage: String? = null,
    val description: String? = null,
    val source: Source? = null,
    val title: String? = null,
    val url: String? = null,

    val content: String? = null
)
data class Result(
    val totalResults: Int? = null,
    val articles: List<ArticlesItem?>? = null,
    val status: String? = null
)
data class Source(
    val name: String? = null,
    val id: String? = null
)
