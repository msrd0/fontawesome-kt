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

/** Crop simple */
object FA_CROP_SIMPLE: Icon {
	
	override val name get() = "Crop simple"
	
	override val unicode get() = "f565"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M128 384H352V448H128C92.65 448 64 419.3 64 384V128H32C14.33 128 0 113.7 0 96C0 78.33 14.33 64 32 64H64V32C64 14.33 78.33 0 96 0C113.7 0 128 14.33 128 32V384zM384 128H160V64H384C419.3 64 448 92.65 448 128V384H480C497.7 384 512 398.3 512 416C512 433.7 497.7 448 480 448H448V480C448 497.7 433.7 512 416 512C398.3 512 384 497.7 384 480V128z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_CROP_SIMPLE]. */
val FA_CROP_ALT = FA_CROP_SIMPLE
