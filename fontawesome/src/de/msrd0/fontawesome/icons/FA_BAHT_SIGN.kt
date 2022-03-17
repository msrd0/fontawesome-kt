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

/** Baht Sign */
object FA_BAHT_SIGN: Icon {
	
	override val name get() = "Baht Sign"
	
	override val unicode get() = "e0ac"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M176 32V64C237.9 64 288 114.1 288 176C288 200.2 280.3 222.6 267.3 240.9C298.9 260.7 320 295.9 320 336C320 397.9 269.9 448 208 448H176V480C176 497.7 161.7 512 144 512C126.3 512 112 497.7 112 480V448H41.74C18.69 448 0 429.3 0 406.3V101.6C0 80.82 16.82 64 37.57 64H112V32C112 14.33 126.3 0 144 0C161.7 0 176 14.33 176 32V32zM112 128H64V224H112V128zM224 176C224 149.5 202.5 128 176 128V224C202.5 224 224 202.5 224 176zM112 288H64V384H112V288zM208 384C234.5 384 256 362.5 256 336C256 309.5 234.5 288 208 288H176V384H208z"/></svg>"""
		else -> null
	}
	
}
