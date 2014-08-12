/*
 * This file is part of Flow Permissions, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2013 Spout LLC <http://www.spout.org/>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.flowpowered.permissions;

import java.util.Set;

/**
 * Anything that can have permissions and be a member of groups.
 */
public interface PermissionSubject {
    /**
     * Checks whether or not the PermissionSubject has a given permission in its default {@link PermissionDomain}.
     * 
     * @param permission the permission to check
     * @return true if has the permission, false otherwise
     */
    boolean hasPermission(String permission);

    /**
     * Checks whether or not the PermissionSubject has a given permission in a {@link PermissionDomain}.
     * 
     * @param permission the permission to check
     * @param domain the {@link PermissionDomain} in which the permission should be checked
     * @return true if has the permission, false otherwise
     */
    boolean hasPermission(String permission, PermissionDomain domain);

    /**
     * Checks whether or not the PermissionSubject belongs to a given group in its default {@link PermissionDomain}.
     * 
     * @param group the group to check
     * @return true if belongs, false otherwise
     */
    boolean isInGroup(String group);

    /**
     * Checks whether or not the PermissionSubject belongs to a given group in a given {@link PermissionDomain}.
     * 
     * @param group the group to check
     * @param domain the {@link PermissionDomain} in which the group should be checked
     * @return true if belongs, false otherwise
     */
    boolean isInGroup(String group, PermissionDomain domain);

    /**
     * Gets all the groups which this PermissionSubject belongs to in its default {@link PermissionDomain}.
     * 
     * @return a Set of all the groups.
     */
    Set<String> getGroups();

    /**
     * Gets all the groups which this PermissionSubject belongs to in a given default {@link PermissionDomain}.
     * 
     * @param domain the {@link PermissionDomain} from which the groups should be retrieved
     * @return a Set of all the groups.
     */
    Set<String> getGroups(PermissionDomain domain);
}
