package com.mmunoz.notemark.auth.presentation.landing

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mmunoz.notemark.R
import com.mmunoz.notemark.core.presentation.designsystem.NoteMarkTheme
import com.mmunoz.notemark.core.presentation.designsystem.components.NoteHeaderText
import com.mmunoz.notemark.core.presentation.designsystem.components.NoteOutlineButton
import com.mmunoz.notemark.core.presentation.designsystem.components.NotePrimaryButton

@Composable
fun LandingScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(Color.Gray)
            .fillMaxSize()

    ){
        val painter = painterResource(id = R.drawable.landing)
        Image(
            painter = painter,
            modifier = Modifier
                .aspectRatio(painter.intrinsicSize.width / painter.intrinsicSize.height),
            alignment = Alignment.TopCenter,
            contentDescription = stringResource(R.string.landing_background),
            contentScale = ContentScale.Fit
        )

        Column(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp
                    )
                )
                .background(MaterialTheme.colorScheme.surface)
                .align(Alignment.BottomCenter)
                .padding(
                    top = 50.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 36.dp
                ),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ){
            NoteHeaderText(
                titleText = stringResource(R.string.landing_title),
                descText = stringResource(R.string.landing_desc),
            )
            Spacer(Modifier.height(16.dp))

            NotePrimaryButton(
                text = stringResource(R.string.btn_get_started),
                modifier = Modifier
                    .fillMaxWidth(),
                onClick = {}
            )
            //stringResource(R.string.btn_get_started)

            NoteOutlineButton(
                text = stringResource(R.string.btn_log_in),
                modifier = Modifier
                    .fillMaxWidth(),
                onClick = {}
            )
        }//stringResource(R.string.btn_log_in)
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFF,
    showSystemUi = true
)
@Composable
private fun LandingScreenPreview() {
    NoteMarkTheme {
        LandingScreen(

        )
    }
}