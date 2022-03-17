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

object FA_TEXT_HEIGHT: Icon {
	
	override val name get() = "text-height"
	
	override val unicode get() = "f034"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M288 32.01H32c-17.67 0-32 14.31-32 32v64c0 17.69 14.33 32 32 32s32-14.31 32-32v-32h64v320H96c-17.67 0-32 14.31-32 32s14.33 32 32 32h128c17.67 0 32-14.31 32-32s-14.33-32-32-32H192v-320h64v32c0 17.69 14.33 32 32 32s32-14.31 32-32v-64C320 46.33 305.7 32.01 288 32.01zM521.4 361.4L512 370.8V141.3l9.375 9.375C527.6 156.9 535.8 160 544 160s16.38-3.125 22.62-9.375c12.5-12.5 12.5-32.75 0-45.25l-64-64c-12.5-12.5-32.75-12.5-45.25 0l-64 64c-12.5 12.5-12.5 32.75 0 45.25s32.75 12.5 45.25 0L448 141.3v229.5l-9.375-9.375c-12.5-12.5-32.75-12.5-45.25 0s-12.5 32.75 0 45.25l64 64C463.6 476.9 471.8 480 480 480s16.38-3.118 22.62-9.368l64-64c12.5-12.5 12.5-32.75 0-45.25S533.9 348.9 521.4 361.4z"/></svg>"""
		else -> null
	}
	
}
