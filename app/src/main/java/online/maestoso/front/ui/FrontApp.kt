package online.maestoso.front.ui

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun FrontApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {
    val navigationType: FrontNavigationType
    val contentType: FrontContentType
    val viewModel: FrontViewModel = viewModel()
    val frontUiState = viewModel.uiState.collectAsState().value

    when(windowSize) {
        WindowWidthSizeClass.Compact -> {
            navigationType = FrontNavigationType.BOTTOM
            contentType = FrontContentType.LIST_ONLY
        }
        WindowWidthSizeClass.Medium -> {
            navigationType = FrontNavigationType.RAIL
            contentType = FrontContentType.LIST_ONLY
        }
        WindowWidthSizeClass.Expanded -> {
            navigationType = FrontNavigationType.DRAWER
            contentType = FrontContentType.LIST_AND_DETAIL
        }
        else -> {
            navigationType = FrontNavigationType.BOTTOM
            contentType = FrontContentType.LIST_ONLY
        }
    }
    FrontDashboardScreen(
        navigationType,
        contentType,
        frontUiState,
        onTabPressed = { },

    )
}