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

object FA_GOPURAM: Icon {
	
	override val name get() = "Gopuram"
	
	override val unicode get() = "f664"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M496 352h-16V240c0-8.8-7.2-16-16-16h-16v-80c0-8.8-7.2-16-16-16h-16V16c0-8.8-7.2-16-16-16s-16 7.2-16 16v16h-64V16c0-8.8-7.2-16-16-16s-16 7.2-16 16v16h-64V16c0-8.8-7.2-16-16-16s-16 7.2-16 16v16h-64V16c0-8.8-7.2-16-16-16S96 7.2 96 16v112H80c-8.8 0-16 7.2-16 16v80H48c-8.8 0-16 7.2-16 16v112H16c-8.8 0-16 7.2-16 16v128c0 8.8 7.2 16 16 16h80V352h32V224h32v-96h32v96h-32v128h-32v160h80v-80c0-8.8 7.2-16 16-16h64c8.8 0 16 7.2 16 16v80h80V352h-32V224h-32v-96h32v96h32v128h32v160h80c8.8 0 16-7.2 16-16V368c0-8.8-7.2-16-16-16zM232 176c0-8.8 7.2-16 16-16h16c8.8 0 16 7.2 16 16v48h-48zm56 176h-64v-64c0-8.8 7.2-16 16-16h32c8.8 0 16 7.2 16 16z"/></svg>"""
		else -> null
	}
	
}
