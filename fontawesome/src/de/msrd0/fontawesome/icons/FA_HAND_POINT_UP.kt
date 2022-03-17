/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID
import de.msrd0.fontawesome.Style.REGULAR

/** Hand Pointing Up */
object FA_HAND_POINT_UP: Icon {
	
	override val name get() = "Hand Pointing Up"
	
	override val unicode get() = "f0a6"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M288 288c17.69 0 32-14.33 32-32V192c0-17.67-14.31-32-32-32s-32 14.33-32 32v64C256 273.7 270.3 288 288 288zM224 244.4V160c0-17.67-14.31-32-32-32S160 142.3 160 160v80h40C208.5 240 216.5 241.7 224 244.4zM128 240V32c0-17.67-14.31-32-32-32S64 14.33 64 32v208.8C66.66 240.5 69.26 240 72 240H128zM384 192c-17.69 0-32 14.33-32 32v64c0 17.67 14.31 32 32 32s32-14.33 32-32V224C416 206.3 401.7 192 384 192zM323.8 309C313.6 315.1 301.3 320 288 320c-5.766 0-11.24-1.08-16.55-2.51C268.6 354.6 237.9 384 200 384H127.1C119.2 384 112 376.8 112 368S119.2 352 127.1 352l69.72 .0001c15.52 0 42.28-11.29 42.28-40C239.1 289.9 222.1 272 200 272h-128C49.91 272 32 289.9 32 312v63.41c0 33.13 16 64.56 42.81 84.13l36.41 26.45C134.5 502.9 162.5 512 191.3 512H280c75.11 0 136-60.89 136-136v-32.88C406.6 348.6 395.7 352 384 352C356.1 352 332.6 333.1 323.8 309z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M376 192c-6.428 0-12.66 .8457-18.6 2.434C344.7 173.8 321.9 160 296 160c-6.428 0-12.66 .8457-18.6 2.434C264.7 141.8 241.9 128 216 128C213.3 128 210.6 128.1 208 128.4V72C208 32.3 175.7 0 136 0S64 32.3 64 72v196.3C44.51 284.5 32 308.8 32 336v49.88c0 32.1 17.1 61.65 44.63 77.12l55.83 31.35C153.1 505.9 176.4 512 199.8 512h107.9C385.1 512 448 447.4 448 368V264C448 224.3 415.7 192 376 192zM272 232c0-13.23 10.78-24 24-24S320 218.8 320 232v47.91C320 293.1 309.2 304 296 304S272 293.2 272 280V232zM192 200C192 186.8 202.8 176 216 176s24 10.77 24 24v48c0 3.029-.7012 5.875-1.73 8.545C227.9 251.3 216.4 248 204 248H192V200zM112 72c0-13.23 10.78-24 24-24S160 58.77 160 72v176H120c-2.686 0-5.217 .5566-7.84 .793C112.2 248.5 112 248.3 112 248V72zM307.7 464H199.8c-15.25 0-30.41-3.984-43.88-11.52l-55.78-31.34C87.72 414.2 80 400.6 80 385.9V336c0-22.06 17.94-40 40-40h84c15.44 0 28 12.56 28 28S219.4 352 204 352H152C138.8 352 128 362.8 128 376s10.75 24 24 24h52c33.23 0 61.25-21.58 71.54-51.36C282 350.7 288.9 352 296 352c5.041 0 9.836-1.166 14.66-2.178C322 374.6 346.1 392 376 392c7.684 0 14.94-1.557 21.87-3.836C388.9 431.4 351.9 464 307.7 464zM400 320c0 13.23-10.78 24-24 24S352 333.2 352 320V264c0-13.23 10.78-24 24-24s24 10.77 24 24V320z"/></svg>"""
		else -> null
	}
	
}
