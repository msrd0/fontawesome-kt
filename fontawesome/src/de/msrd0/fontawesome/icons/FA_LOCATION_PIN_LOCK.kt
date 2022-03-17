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

object FA_LOCATION_PIN_LOCK: Icon {
	
	override val name get() = "Location Pin-lock"
	
	override val unicode get() = "e51f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M168.3 499.2C116.1 435 0 279.4 0 192C0 85.96 85.96 0 192 0C287.7 0 366.1 69.96 381.6 161.5C328.5 170.3 288 216.4 288 272V296.6C268.9 307.6 256 328.3 256 352V446.8C240.7 467.4 226.7 485.4 215.7 499.2C203.4 514.5 180.6 514.5 168.3 499.2H168.3zM192 256C227.3 256 256 227.3 256 192C256 156.7 227.3 128 192 128C156.7 128 128 156.7 128 192C128 227.3 156.7 256 192 256zM400 192C444.2 192 480 227.8 480 272V320C497.7 320 512 334.3 512 352V480C512 497.7 497.7 512 480 512H320C302.3 512 288 497.7 288 480V352C288 334.3 302.3 320 320 320V272C320 227.8 355.8 192 400 192zM400 240C382.3 240 368 254.3 368 272V320H432V272C432 254.3 417.7 240 400 240z"/></svg>"""
		else -> null
	}
	
}
