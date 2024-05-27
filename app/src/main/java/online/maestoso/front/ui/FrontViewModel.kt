package online.maestoso.front.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class FrontViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(FrontUiState())
    val uiState: StateFlow<FrontUiState> = _uiState

    init {
        initializeUIState()
    }

    private fun initializeUIState() {

    }
}