package br.senai.sp.jandira.rotas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.rotas.screens.login.Loginscreen
import br.senai.sp.jandira.rotas.screens.menu.MenuScreen
import br.senai.sp.jandira.rotas.screens.pedidos.PedidosScreen
import br.senai.sp.jandira.rotas.screens.perfil.PerfilScreen
import br.senai.sp.jandira.rotas.ui.theme.RotasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RotasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "login"
//                        graph =
                    ){
                        composable(route = "login"){ Loginscreen(navController)}
                        composable(route = "menu"){ MenuScreen(navController) }
                        composable(route = "perfil"){ PerfilScreen(navController) }
                        composable(route = "pedido"){ PedidosScreen(navController) }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RotasTheme {
        Greeting("Android")
    }
}