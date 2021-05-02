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

object FA_MONERO: Icon {
	
	override val name get() = "Monero"
	
	override val unicode get() = "f3d0"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 496 512"><path d="M352 384h108.4C417 455.9 338.1 504 248 504S79 455.9 35.6 384H144V256.2L248 361l104-105v128zM88 336V128l159.4 159.4L408 128v208h74.8c8.5-25.1 13.2-52 13.2-80C496 119 385 8 248 8S0 119 0 256c0 28 4.6 54.9 13.2 80H88z"/></svg>"""
		else -> null
	}
	
}
