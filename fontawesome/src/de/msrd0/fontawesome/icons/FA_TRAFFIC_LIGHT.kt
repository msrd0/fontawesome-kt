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

object FA_TRAFFIC_LIGHT: Icon {
	
	override val name get() = "Traffic Light"
	
	override val unicode get() = "f637"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M384 192h-64v-37.88c37.2-13.22 64-48.38 64-90.12h-64V32c0-17.67-14.33-32-32-32H96C78.33 0 64 14.33 64 32v32H0c0 41.74 26.8 76.9 64 90.12V192H0c0 41.74 26.8 76.9 64 90.12V320H0c0 42.84 28.25 78.69 66.99 91.05C79.42 468.72 130.6 512 192 512s112.58-43.28 125.01-100.95C355.75 398.69 384 362.84 384 320h-64v-37.88c37.2-13.22 64-48.38 64-90.12zM192 416c-26.51 0-48-21.49-48-48s21.49-48 48-48 48 21.49 48 48-21.49 48-48 48zm0-128c-26.51 0-48-21.49-48-48s21.49-48 48-48 48 21.49 48 48-21.49 48-48 48zm0-128c-26.51 0-48-21.49-48-48s21.49-48 48-48 48 21.49 48 48-21.49 48-48 48z"/></svg>"""
		else -> null
	}
	
}
