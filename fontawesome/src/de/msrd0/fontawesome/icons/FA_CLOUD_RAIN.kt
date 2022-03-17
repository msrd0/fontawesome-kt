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

/** Cloud with Rain */
object FA_CLOUD_RAIN: Icon {
	
	override val name get() = "Cloud with Rain"
	
	override val unicode get() = "f73d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M416 128c-.625 0-1.125 .25-1.625 .25C415.5 123 416 117.6 416 112C416 67.75 380.3 32 336 32c-24.62 0-46.25 11.25-61 28.75C256.4 24.75 219.3 0 176 0C114.1 0 64 50.13 64 112c0 7.25 .75 14.25 2.125 21.25C27.75 145.8 0 181.5 0 224c0 53 43 96 96 96h320c53 0 96-43 96-96S469 128 416 128zM368 464c0 26.51 21.49 48 48 48s48-21.49 48-48s-48.01-95.1-48.01-95.1S368 437.5 368 464zM48 464C48 490.5 69.49 512 96 512s48-21.49 48-48s-48.01-95.1-48.01-95.1S48 437.5 48 464zM208 464c0 26.51 21.49 48 48 48s48-21.49 48-48s-48.01-95.1-48.01-95.1S208 437.5 208 464z"/></svg>"""
		else -> null
	}
	
}
