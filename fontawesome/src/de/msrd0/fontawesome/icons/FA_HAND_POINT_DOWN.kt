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

/** Hand Pointing Down */
object FA_HAND_POINT_DOWN: Icon {
	
	override val name get() = "Hand Pointing Down"
	
	override val unicode get() = "f0a7"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M256 256v64c0 17.67 14.31 32 32 32s32-14.33 32-32V256c0-17.67-14.31-32-32-32S256 238.3 256 256zM200 272H160V352c0 17.67 14.31 32 32 32s32-14.33 32-32V267.6C216.5 270.3 208.5 272 200 272zM72 272C69.26 272 66.66 271.5 64 271.2V480c0 17.67 14.31 32 32 32s32-14.33 32-32V272H72zM416 288V224c0-17.67-14.31-32-32-32s-32 14.33-32 32v64c0 17.67 14.31 32 32 32S416 305.7 416 288zM384 160c11.72 0 22.55 3.381 32 8.879V136C416 60.89 355.1 0 280 0L191.3 0C162.5 0 134.5 9.107 111.2 26.02L74.81 52.47C48 72.03 32 103.5 32 136.6V200C32 222.1 49.91 240 72 240h128c22.09 0 39.1-17.91 39.1-39.1c0-28.73-26.72-40-42.28-40l-69.72 0C119.2 160 112 152.8 112 144S119.2 128 127.1 128H200c37.87 0 68.59 29.35 71.45 66.51C276.8 193.1 282.2 192 288 192c13.28 0 25.6 4.047 35.83 10.97C332.6 178 356.1 160 384 160z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M448 248V144C448 64.6 385.1 0 307.7 0H199.8C176.4 0 153.1 6.104 132.5 17.65L76.63 49C49.1 64.47 32 94.02 32 126.1V176c0 27.23 12.51 51.53 32 67.69V440C64 479.7 96.3 512 136 512s72-32.3 72-72v-56.44C210.6 383.9 213.3 384 216 384c25.95 0 48.73-13.79 61.4-34.43C283.3 351.2 289.6 352 296 352c25.95 0 48.73-13.79 61.4-34.43C363.3 319.2 369.6 320 376 320C415.7 320 448 287.7 448 248zM272 232c0-13.23 10.78-24 24-24S320 218.9 320 232.1V280c0 13.23-10.78 24-24 24S272 293.2 272 280V232zM192 264h12c12.39 0 23.93-3.264 34.27-8.545C239.3 258.1 240 260.1 240 264v48c0 13.23-10.78 24-24 24S192 325.2 192 312V264zM112 264c0-.2813 .1504-.5137 .1602-.793C114.8 263.4 117.3 264 120 264H160v176c0 13.23-10.78 24-24 24S112 453.2 112 440V264zM397.9 123.8C390.9 121.6 383.7 120 376 120c-29.04 0-53.96 17.37-65.34 42.18C305.8 161.2 301 160 296 160c-7.139 0-13.96 1.273-20.46 3.355C265.2 133.6 237.2 112 204 112H152C138.8 112 128 122.8 128 136S138.8 160 152 160h52c15.44 0 28 12.56 28 28S219.4 216 204 216H120C97.94 216 80 198.1 80 176V126.1c0-14.77 7.719-28.28 20.16-35.27l55.78-31.34C169.4 51.98 184.6 48 199.8 48h107.9C351.9 48 388.9 80.56 397.9 123.8zM400 248c0 13.23-10.78 24-24 24S352 261.2 352 248V192c0-13.23 10.78-24 24-24S400 178.8 400 192V248z"/></svg>"""
		else -> null
	}
	
}
