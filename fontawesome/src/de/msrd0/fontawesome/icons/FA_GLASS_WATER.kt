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

object FA_GLASS_WATER: Icon {
	
	override val name get() = "Glass Water"
	
	override val unicode get() = "e4f4"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M352 0C360.9 0 369.4 3.692 375.4 10.19C381.5 16.69 384.6 25.42 383.9 34.28L355.1 437.7C352.1 479.6 317.3 512 275.3 512H108.7C66.72 512 31.89 479.6 28.9 437.7L.0813 34.28C-.5517 25.42 2.527 16.69 8.58 10.19C14.63 3.692 23.12 0 32 0L352 0zM97.19 168.6C116.6 178.3 139.4 178.3 158.8 168.6C179.7 158.1 204.3 158.1 225.2 168.6C244.6 178.3 267.4 178.3 286.8 168.6L311 156.5L317.6 64H66.37L72.97 156.5L97.19 168.6z"/></svg>"""
		else -> null
	}
	
}
