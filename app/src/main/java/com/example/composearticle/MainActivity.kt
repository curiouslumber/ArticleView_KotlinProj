package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        ArticleView()
                }
            }
        }
    }
}


@Composable
fun Article(name: String, description: String, article: String, modifier: Modifier = Modifier){
 val image = painterResource(id = R.drawable.bg_compose_background)
 Column {
     Image(painter = image, contentDescription = "Jetpack Compose Image")
     Text(text = name, modifier.padding(16.dp), fontSize = 24.sp)
     Text(text = description, modifier.padding(horizontal = 16.dp), textAlign = TextAlign.Justify)
     Text(text = article, modifier.padding(16.dp), textAlign = TextAlign.Justify )
 }
}

@Preview(showBackground = true)
@Composable
fun ArticleView(){
    ComposeArticleTheme {
        Article(
            name = stringResource(R.string.title),
            description = stringResource(R.string.description),
            article = stringResource(R.string.article)
        )
    }
}
