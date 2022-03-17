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

/** Droplet slash */
object FA_DROPLET_SLASH: Icon {
	
	override val name get() = "Droplet slash"
	
	override val unicode get() = "f5c7"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M215.3 143.4C243.5 95.07 274.2 49.29 294.9 19.3C307.2 1.585 332.8 1.585 345.1 19.3C393.7 89.43 496 245.9 496 319.1C496 333.7 494.4 347.1 491.5 359.9L630.8 469.1C641.2 477.3 643.1 492.4 634.9 502.8C626.7 513.2 611.6 515.1 601.2 506.9L9.196 42.89C-1.236 34.71-3.065 19.63 5.112 9.196C13.29-1.236 28.37-3.065 38.81 5.112L215.3 143.4zM143.1 319.1C143.1 296.5 154.3 264.6 169.1 229.9L443.5 445.4C411.7 476.7 368.1 496 319.1 496C222.8 496 143.1 417.2 143.1 319.1V319.1zM239.1 319.1C239.1 311.2 232.8 303.1 223.1 303.1C215.2 303.1 207.1 311.2 207.1 319.1C207.1 381.9 258.1 432 319.1 432C328.8 432 336 424.8 336 416C336 407.2 328.8 400 319.1 400C275.8 400 239.1 364.2 239.1 319.1V319.1z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_DROPLET_SLASH]. */
val FA_TINT_SLASH = FA_DROPLET_SLASH
