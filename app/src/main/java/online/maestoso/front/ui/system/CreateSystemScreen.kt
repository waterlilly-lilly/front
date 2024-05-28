package online.maestoso.front.ui.system

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import online.maestoso.front.ui.FrontUiState

@Composable
fun CreateSystemScreen(
    frontUiState: FrontUiState,
    onBackPressed: () -> Unit,
    modifier: Modifier = Modifier,
    isFullSCreen: Boolean = false
) {
    BackHandler {
        onBackPressed()
    }
    Box(modifier = modifier) {

    }
}