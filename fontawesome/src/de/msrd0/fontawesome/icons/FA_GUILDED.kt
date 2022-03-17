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
import de.msrd0.fontawesome.Style.BRANDS

/** Guilded */
object FA_GUILDED: Icon {
	
	override val name get() = "Guilded"
	
	override val unicode get() = "e07e"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M443.427,64H4.571c0,103.26,22.192,180.06,43.418,222.358C112.046,414.135,224,448,225.256,448a312.824,312.824,0,0,0,140.55-103.477c25.907-33.923,53.1-87.19,65.916-145.761H171.833c4.14,36.429,22.177,67.946,45.1,86.944h88.589c-17.012,28.213-48.186,54.4-80.456,69.482-31.232-13.259-69.09-46.544-96.548-98.362-26.726-53.833-27.092-105.883-27.092-105.883H437.573A625.91,625.91,0,0,0,443.427,64Z"/></svg>"""
		else -> null
	}
	
}
