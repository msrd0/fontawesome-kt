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

/** Cart flatbed */
object FA_CART_FLATBED: Icon {
	
	override val name get() = "Cart flatbed"
	
	override val unicode get() = "f474"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M240 320h320c26.4 0 48-21.6 48-48v-192C608 53.6 586.4 32 560 32H448v128l-48-32L352 160V32H240C213.6 32 192 53.6 192 80v192C192 298.4 213.6 320 240 320zM608 384H128V64c0-35.2-28.8-64-64-64H31.1C14.4 0 0 14.4 0 32S14.4 64 31.1 64H48C56.84 64 64 71.16 64 80v335.1c0 17.6 14.4 32 32 32l66.92-.0009C161.1 453 160 458.4 160 464C160 490.5 181.5 512 208 512S256 490.5 256 464c0-5.641-1.13-10.97-2.917-16h197.9c-1.787 5.027-2.928 10.36-2.928 16C448 490.5 469.5 512 496 512c26.51 0 48.01-21.49 48.01-47.1c0-5.641-1.12-10.97-2.907-16l66.88 .0009C625.6 448 640 433.6 640 415.1C640 398.4 625.6 384 608 384z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_CART_FLATBED]. */
val FA_DOLLY_FLATBED = FA_CART_FLATBED
