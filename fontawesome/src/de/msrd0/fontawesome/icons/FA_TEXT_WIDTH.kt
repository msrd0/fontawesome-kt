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

object FA_TEXT_WIDTH: Icon {
	
	override val name get() = "Text Width"
	
	override val unicode get() = "f035"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M416 32.01H32c-17.67 0-32 14.31-32 32v63.1c0 17.69 14.33 32 32 32s32-14.31 32-32v-32h128v128H176c-17.67 0-32 14.31-32 31.1s14.33 32 32 32h96c17.67 0 32-14.31 32-32s-14.33-31.1-32-31.1H256v-128h128v32c0 17.69 14.33 32 32 32s32-14.32 32-32V64.01C448 46.33 433.7 32.01 416 32.01zM374.6 297.4c-12.5-12.5-32.75-12.5-45.25 0s-12.5 32.75 0 45.25l9.375 9.375h-229.5L118.6 342.6c12.5-12.5 12.5-32.75 0-45.25s-32.75-12.5-45.25 0l-64 64c-12.5 12.5-12.5 32.75 0 45.25l64 64C79.63 476.9 87.81 480 96 480s16.38-3.118 22.62-9.368c12.5-12.5 12.5-32.75 0-45.25l-9.375-9.375h229.5l-9.375 9.375c-12.5 12.5-12.5 32.75 0 45.25C335.6 476.9 343.8 480 352 480s16.38-3.118 22.62-9.368l64-64c12.5-12.5 12.5-32.75 0-45.25L374.6 297.4z"/></svg>"""
		else -> null
	}
	
}
