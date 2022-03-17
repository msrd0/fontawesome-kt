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

/** Bottle Droplet */
object FA_BOTTLE_DROPLET: Icon {
	
	override val name get() = "Bottle Droplet"
	
	override val unicode get() = "e4c4"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M224 0C237.3-.0003 248 10.74 248 23.1C248 37.25 237.3 47.1 224 48L216 48V140.9C258.6 161.6 288 205.4 288 256V448C288 483.3 259.3 512 224 512H96C60.65 512 32 483.3 32 448V256C32 205.4 61.37 161.6 104 140.9V48L96 48C82.75 48 72 37.26 72 24C71.1 10.75 82.74 .0045 95.1 .0042L224 0zM160 384C186.5 384 208 368 208 336C208 304 160 256 160 256C160 256 112 304 112 336C112 362.5 133.5 384 160 384z"/></svg>"""
		else -> null
	}
	
}
