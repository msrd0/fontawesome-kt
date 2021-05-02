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

object FA_ROCKRMS: Icon {
	
	override val name get() = "Rockrms"
	
	override val unicode get() = "f3e9"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 496 512"><path d="M248 8C111 8 0 119 0 256s111 248 248 248 248-111 248-248S385 8 248 8zm157.4 419.5h-90l-112-131.3c-17.9-20.4-3.9-56.1 26.6-56.1h75.3l-84.6-99.3-84.3 98.9h-90L193.5 67.2c14.4-18.4 41.3-17.3 54.5 0l157.7 185.1c19 22.8 2 57.2-27.6 56.1-.6 0-74.2.2-74.2.2l101.5 118.9z"/></svg>"""
		else -> null
	}
	
}
